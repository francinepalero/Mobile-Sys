package com.example.myapplication_palero_mendiolabt701;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MainActivity main1 = new MainActivity();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String fname = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView text = findViewById(R.id.DisplayFName);

        text.setText("Welcome to Battle.net, " + fname + "!");
    }
}