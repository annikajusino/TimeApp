package com.test.annika.timeapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

//    private static final String TAG = "LoginActivity";


    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        mAuth = FirebaseAuth.getInstance();

        EditText Username = findViewById(R.id.etUsername);
        EditText Password = findViewById(R.id.etPassword);

        Button Login = findViewById(R.id.bLogin);

        TextView Register = findViewById(R.id.tvRegister);
        TextView RUin = findViewById(R.id.tvRUin);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(startRegister);
            }
        });

    }
}
