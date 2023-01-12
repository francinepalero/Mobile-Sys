package com.example.mendiola_palero_finalstp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.*;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView logo;

    private String sharedPrefFile = "com.example.android.myapplication";
    String mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo.setImageResource(R.drawable.school_logo);

    }
}