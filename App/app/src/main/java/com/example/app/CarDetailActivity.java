package com.example.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// CarDetailActivity.java
public class CarDetailActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_detail);

        ImageView backButton = findViewById(R.id.backButton);

        // Nhận dữ liệu từ Intent
        String carName = getIntent().getStringExtra("car_name");
        String carPrice = getIntent().getStringExtra("car_price");
        String carRating = getIntent().getStringExtra("car_rating");
        String carImage = getIntent().getStringExtra("car_image");

        // Hiển thị dữ liệu
        TextView carNameTextView = findViewById(R.id.productName);
        TextView carPriceTextView = findViewById(R.id.productPrice);
        TextView carRatingTextView = findViewById(R.id.productDescription);
        ImageView carImageView = findViewById(R.id.productImage);


        carNameTextView.setText(carName);
        carPriceTextView.setText("$" + carPrice);
        carRatingTextView.setText(carRating);
//        carImageView.setImageResource(Integer.parseInt(carImage));

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
