package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText fullNameEditText, emailEditText, passwordEditText;
    private Button registerButton;
    private TextView loginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        // Khởi tạo các view
        fullNameEditText = findViewById(R.id.fullNameRegisterEditText);
        emailEditText = findViewById(R.id.emailRegisterEditText);
        passwordEditText = findViewById(R.id.passwordRegisterEditText);
        registerButton = findViewById(R.id.registerButton);
        loginLink = findViewById(R.id.loginLink);

        // Xử lý khi người dùng nhấn vào "Already have account? Sign Up"
        loginLink.setOnClickListener(v -> {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
        });

        // Xử lý sự kiện khi nhấn nút Register
        registerButton.setOnClickListener(v -> {
            String fullname = fullNameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            boolean success = dbHelper.insertUser(email, password, fullname);
            if (success) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(RegisterActivity.this, "Register unsuccessfully", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
