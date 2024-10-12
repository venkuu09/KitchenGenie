package com.example.kitchengenie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {
    private TextView recipeTitle, ingredients, instructions;
    private ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        recipeTitle = findViewById(R.id.recipe_title);
        ingredients = findViewById(R.id.ingredients);
        instructions = findViewById(R.id.instructions);
        recipeImage = findViewById(R.id.recipe_image);

        // Load recipe details here based on intent extras
    }
}
