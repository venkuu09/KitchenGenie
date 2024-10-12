package com.example.kitchengenie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private EditText emailInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        emailInput = findViewById(R.id.email);
        passwordInput = findViewById(R.id.password);
        Button signupButton = findViewById(R.id.signup_button);

        signupButton.setOnClickListener(v -> {
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();
            // Handle signup logic
        });
    }
}
