package com.example.kitchengenie;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class RecipeListActivity extends AppCompatActivity {
    private RecyclerView recipeRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);


        // Set up RecyclerView for displaying recipes
        setupRecipeList();
    }

    private void setupRecipeList() {
        // Load and display recipes in the RecyclerView
    }
}
