package com.example.android.password_validator;

import java.util.regex.Pattern;

public class Validator_{

    public boolean validate(String password){
        Pattern uppercase = Pattern.compile("[A-Z]");//requirement1: include uppercase
        Pattern lowercase = Pattern.compile("[a-z]");//requirement2: include lowercase
        Pattern digitCase = Pattern.compile("[0-9]");//requirement3: include digits
        Pattern whitespace = Pattern.compile( "[ \\t\\n\\x0B\\f\\r]");//requirement4: whitespace is not allowed
        int length = password.length();//requirement5: check the length of password

        if(!uppercase.matcher(password).find()){
           return false;
        }
       if(!lowercase.matcher(password).find()){
            return false;
            }
            if(!digitCase.matcher(password).find()){

            return false;
            }
        if(whitespace.matcher(password).find()){

            return false;
        }
        if(length<9){
            return false;
        }
     else{
            return true;
        }
    }
   /* public void result(int rules){
        boolean valid = true;
        if(rules ==0){
            valid = false;
        }
        else{
            valid = true;
        }
    }*/
}
