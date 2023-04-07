package com.example.homerentalapp;

import static com.example.homerentalapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(layout.activity_login);

//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final Button button = (Button) findViewById(R.id.btn_login);
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),navigation.class);
//                startActivity(i);
//
//            }
//        });
    }
}