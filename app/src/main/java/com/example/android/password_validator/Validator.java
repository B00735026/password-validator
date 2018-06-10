package com.example.android.password_validator;

import java.util.regex.Pattern;
public class Validator {
    public boolean validate(String password) {
        Pattern string = Pattern.compile("password");
        int length = password.length();

       boolean valid = true;
        if (string.matcher(password).find())
         valid = false;

        else if (length < 9)
           valid = false;

        return valid;

    }

}
