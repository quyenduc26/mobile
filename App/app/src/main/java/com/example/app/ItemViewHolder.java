package com.example.app;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, priceView, rateView;

    Button rentButton;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.car_image);
        nameView = itemView.findViewById(R.id.car_name);
        priceView = itemView.findViewById(R.id.car_price);
        rateView = itemView.findViewById(R.id.car_rating);
        rentButton = itemView.findViewById(R.id.rent_button);
    }
}
