package com.example.foregroundservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText body ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        body = (EditText) findViewById(R.id.body);
    }

    public void startMethod(View v){
        Intent toServices = new Intent(this , Services.class);
    }
    public void stopMethod(View v){

    }
}