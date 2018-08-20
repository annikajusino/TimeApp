package com.test.annika.timeapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

         EditText FirstName = findViewById(R.id.etFirstname);
         EditText LastName = findViewById(R.id.etLastname);
         EditText Email = findViewById(R.id.etEmail);
         EditText Phone = findViewById(R.id.etPhone);
         EditText Username = findViewById(R.id.etUsername);
         EditText Password = findViewById(R.id.etPassword1);
         EditText ConfirmPassword = findViewById(R.id.etPassword2);

         Button Register = findViewById(R.id.bRegister);

        //Will need to add something to make sure passwords are the same and if a user already exists
        //Will also probably need to add some regex

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(BackToLogin);

                Toast.makeText(RegisterActivity.this, "User created! Please log in.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
