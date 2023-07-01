package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void LAUNCH(View v){
        Intent i = new Intent(this, Tic.class);
        startActivity(i);


    }
    public void coinflip(View v){
        Intent i = new Intent(this, coinflip.class);
        startActivity(i);
    }
    public void Snakes(View v){
        Intent i = new Intent(this, snakes.class);
        startActivity(i);
    }
    public void PlayerName(View v){
        Intent i = new Intent(this, PlayerName.class);
        startActivity(i);
    }

}