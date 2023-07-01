package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class PlayerName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        final EditText playerNameEt = findViewById(R.id.playerNameEt);
        final AppCompatButton button8 = findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String getPlayerName = playerNameEt.getText().toString();
                if(getPlayerName.isEmpty()){
                    Toast.makeText(PlayerName.this, "Please Enter Name", Toast.LENGTH_LONG ).show();}
                else{
                    Intent intent = new Intent(PlayerName.this, Tic.class);
                    intent.putExtra("playername", getPlayerName);
                    startActivity(intent);
                    finish();
                }

            }
        });

            }

}