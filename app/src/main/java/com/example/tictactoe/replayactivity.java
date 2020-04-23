package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class replayactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replayactivity);
    }
    public void clickHandler(View view){


        Intent intent= new Intent(replayactivity.this,play.class);
        startActivity(intent);
    }
}
