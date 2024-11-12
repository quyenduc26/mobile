package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item( 1, "MC Larren", 250000, R.drawable.p1, 4));
        items.add(new Item( 2, "BMW X7", 250000, R.drawable.p2, 4));
        items.add(new Item( 3, "Bentley", 250000, R.drawable.p3, 4));
        items.add(new Item( 4, "Hyndai Tucson", 250000, R.drawable.p4, 4));
        items.add(new Item( 5, "Lamborghini ", 250000, R.drawable.p5, 4));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(getApplicationContext(), items));


    }
}
