package com.example.mendiola_palero_finalstp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // NUMBER 3
    private ImageView logo;
    private Button button;
    private Spinner spinner;

    // NUMBER 5
    private String sharedPrefFile = "com.example.mendiola_palero_finalstp";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.sp1);

        button = (Button) findViewById(R.id.button1);

        SharedPreferences mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spinner.getSelectedItem().toString();


                // NUMBER 5
                int x = 100;
                String y = String.valueOf(x);
                SharedPreferences.Editor editor = mPreferences.edit();
                editor.putInt("max", x);
                editor.apply();
            }
        });
    }
}