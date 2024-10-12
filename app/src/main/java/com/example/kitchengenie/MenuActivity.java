package com.example.kitchengenie;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.breakfast_button).setOnClickListener(v -> {
            // Open Breakfast Activity
            startActivity(new Intent(this, BreakfastActivity.class));
        });
        // Add similar listeners for lunch, dinner, and snacks buttons
    }
}
