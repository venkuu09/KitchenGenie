package com.example.kitchengenie;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private EditText searchBar;
    private RecyclerView featuredRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set up RecyclerView and other components
        setupFeaturedRecipes();
    }

    private void setupFeaturedRecipes() {
        // Adapter setup for RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        featuredRecipes.setLayoutManager(layoutManager);
        // Create and set your adapter here
    }
}
