package com.example.homerentalapp;

import static com.example.homerentalapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(layout.activity_login);
        String myString = "Hello, World!";
        final Button button = (Button) findViewById(id.loginButton);
        //TextView myTextView = findViewById(id.registerPageText);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), navigation.class);
                startActivity(i);

            }
        });

        MaterialButton myButton = findViewById(R.id.my_button);
        myButton.setElevation(0);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your button function here
                myButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), signup.class);
                        startActivity(i);

                    }
                });
            }
        });


    }
}