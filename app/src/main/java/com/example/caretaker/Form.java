package com.example.caretaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    TextView newUser, forgotPassword;
    EditText email, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //getSupportActionBar().setTitle("Login");

        email = findViewById(R.id.lgemail);
        password = findViewById(R.id.lgpassword);
        newUser = findViewById(R.id.newuser);
        forgotPassword = findViewById(R.id.forgotpassword);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("a") && password.getText().toString().equals("a")) {
                    startActivity(new Intent(Form.this, Homepage.class) );
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Form.this, SignupForm.class);
                startActivity(i);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Form.this, ForgotPassword.class);
                startActivity(i);
            }
        });



    }
}