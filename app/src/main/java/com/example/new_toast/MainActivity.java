package com.example.new_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        simple toast message
        Toast.makeText(getApplicationContext(),"Hello Uma",Toast.LENGTH_LONG).show();
    }
}