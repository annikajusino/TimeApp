package com.test.annika.timeapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
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

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";

    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

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
                createAccount();
            }
        });

    }

    private void createAccount(){
        EditText Email = findViewById(R.id.etEmail);
        EditText Password = findViewById(R.id.etPassword1);
        mAuth.createUserWithEmailAndPassword(Email.getText().toString().trim(),Password.getText().toString().trim())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();

                            Intent BackToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                            startActivity(BackToLogin);

                            Toast.makeText(RegisterActivity.this, "User created! Please log in.", Toast.LENGTH_SHORT).show();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                        // ...
                    }
                });
    }



    @Override
    public void onStart(){
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

}
