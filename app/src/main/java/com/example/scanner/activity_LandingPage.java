package com.example.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        Button setting = findViewById(R.id.button2);
        Button add = findViewById(R.id.button3);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action for scanner button
                Intent intent = new Intent(activity_LandingPage.this, Scanner.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action for add button
                Intent intent = new Intent(activity_LandingPage.this, activity_AddClass.class);
                startActivity(intent);
            }
        });



    }
}
