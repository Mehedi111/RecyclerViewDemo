package com.weebly.sarikcyber.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        products = new ArrayList<>();


        Product product = new Product("Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                4.3,
                60000,
                R.drawable.macbook);
        Product product2 = new Product("Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                4.3,
                60000,
                R.drawable.dellinspiron);
        Product product3 = new Product("Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                4.3,
                60000,
                R.drawable.surface);


        products.add(product);
        products.add(product2);
        products.add(product3);

        RecylerViewAdapter adapter = new RecylerViewAdapter(this, products);
        recyclerView.setAdapter(adapter);




    }
}
