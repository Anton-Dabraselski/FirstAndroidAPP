package com.anton.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");
    }

    public void onButtonClick(View v){
        EditText el1 = (EditText)findViewById(R.id.editTextNumber);
        EditText el2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView resText = (TextView)findViewById(R.id.result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int res = num1 + num2;

        resText.setText(Integer.toString(res));

    }

    public void onStart(){
        super.onStart();
        Log.i(TAG, "onStart");
    }

    public void onResume(){
        super.onResume();
        Log.i(TAG, "onResume");
    }
    public void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

}

