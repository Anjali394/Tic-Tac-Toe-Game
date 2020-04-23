package com.example.tictactoe;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity  {

    String TAG = "MainActivity";
    TextView textView;
    //ListView listview;
    // ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "--OnCreate--");
        textView= (TextView) findViewById(R.id.textView);

    }


    @Override
    protected void onStart () {
        super.onStart();
        Log.i(TAG, "--OnStart--");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.i(TAG, "--OnRestart--");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.i(TAG, "--OnResume--");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.i(TAG, "--OnPause--");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.i(TAG, "--OnStop--");
    }


  /*  public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item= adapter.getItem(i);
        Toast.makeText(this,"You Selected" +item, Toast.LENGTH_LONG).show();

        Intent intent= new Intent(MainActivity.this,ActivityTwo.class);
        startActivity(intent);

    } */


    public void clickHandler(View view){


        Intent intent= new Intent(MainActivity.this,play.class);
        startActivity(intent);
    }



}
