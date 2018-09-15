package com.test.annika.timeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class UserPageActivity extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        Button SignOut = findViewById(R.id.bSignOut);
        Button Chat = findViewById(R.id.bChat);
        Button Listings = findViewById(R.id.bListings);

        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.getInstance().signOut();

                Intent startUserPageActivity = new Intent(UserPageActivity.this, LoginActivity.class);
                startActivity(startUserPageActivity);

            }
        });

        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startChatActivity = new Intent(UserPageActivity.this, ChatActivity.class);
                startActivity(startChatActivity);

            }
        });

        Listings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startListingsActivity = new Intent(UserPageActivity.this, EventDirectoryActivity.class);
                startActivity(startListingsActivity);

            }
        });

    }
}
