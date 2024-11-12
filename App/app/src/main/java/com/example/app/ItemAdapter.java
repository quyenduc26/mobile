package com.example.app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    Context context;
    List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.card_item_full, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.priceView.setText(String.valueOf(items.get(position).getPrice()));
        holder.rateView.setText(String.valueOf(items.get(position).getRate()));
        holder.imageView.setImageResource(items.get(position).getImage());

        holder.rentButton.setOnClickListener(view -> {
            Intent intent = new Intent(context, CarDetailActivity.class);
            intent.putExtra("car_name", items.get(position).getName());
            intent.putExtra("car_price", String.valueOf(items.get(position).getPrice()));
            intent.putExtra("car_rating",String.valueOf(items.get(position).getRate()));
//            intent.putExtra("car_image", items.get(position).getImage());
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
