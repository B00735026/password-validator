package com.example.android.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button btn;
   EditText password;
   TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.validate);
        password = (EditText) findViewById(R.id.password);
        result  = (TextView) findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = password.getText().toString();
                //if user press the validate button, then execute the validate method.
                validate(pass);

            }
        });
    }
public void validate(String password){
   Pattern uppercase = Pattern.compile("[A-Z]");//requirement1: include uppercase
    Pattern lowercase = Pattern.compile("[a-z]");//requirement2: include lowercase
    Pattern digitCase = Pattern.compile("[0-9]");//requirement3: include digits
    Pattern whitespace = Pattern.compile( "[ \\t\\n\\x0B\\f\\r]");//requirement4: whitespace is not allowed
    int length = password.length();//requirement5: check the length of password
   //check whether the password is satisfy requirements.
   if(!uppercase.matcher(password).find()||!lowercase.matcher(password).find()||!digitCase.matcher(password).find()||whitespace.matcher(password).find()||length<9){
       result.setText("Invalid password.");
        }
        else{
        result.setText("Valid password.");
    }
    }


}
