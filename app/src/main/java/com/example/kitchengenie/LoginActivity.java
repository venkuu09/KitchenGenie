package com.example.kitchengenie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText loginEmailInput, loginPasswordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmailInput = findViewById(R.id.login_email);
        loginPasswordInput = findViewById(R.id.login_password);
        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(v -> {
            String email = loginEmailInput.getText().toString();
            String password = loginPasswordInput.getText().toString();
            // Handle login logic
        });
    }
}
