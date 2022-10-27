package com.example.myapplication_palero_mendiolabt701;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication_palero_mendiolabt701.MESSAGE";
    public EditText firstName;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.FirstName);
        button = (Button) findViewById(R.id.SignUp);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                register();
            }

        });
    }
    public void register() {
        Intent intent = new Intent(this,MainActivity2.class);
        String fName = firstName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, fName);
        startActivity(intent);
    }
}

