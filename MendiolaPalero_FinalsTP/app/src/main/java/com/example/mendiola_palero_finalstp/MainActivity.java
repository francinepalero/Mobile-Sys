package com.example.mendiola_palero_finalstp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // NUMBER 3
    ImageView logo;
    //Button button;

    // NUMBER 5
    private final String sharedPrefFile = "com.example.mendiola_palero_finalstp";
    SharedPreferences mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button = (Button)findViewById(R.id.button1);
        // NUMBER 3
        logo.setImageResource(R.drawable.school_logo);

        //button.setOnClickListener(view -> {

        // NUMBER 5
        int x = 100;
        String y = String.valueOf(x);
        SharedPreferences.Editor editor = mPreferences.edit();
        editor.putInt("max", x);
        editor.putString("max", y);
        editor.apply();
    }
}