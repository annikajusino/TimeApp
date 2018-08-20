package com.test.annika.timeapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText Username = findViewById(R.id.etUsername);
        EditText Password = findViewById(R.id.etPassword);

        Button Login = findViewById(R.id.bLogin);

        TextView Register = findViewById(R.id.tvRegister);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(startRegister);
            }
        });

    }

}
