package com.example.foodparcels;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowImgActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimg);

        ImageView image = findViewById(R.id.foodImgView);

        Intent intent = getIntent();

        int burgerKey = intent.getIntExtra("BurgerKey",1);
        int pancakeKey = intent.getIntExtra("PancakeKey",0);

        if (burgerKey == 1) {
            image.setImageResource(R.drawable.burger);
        }

        if (pancakeKey == 0) {
            image.setImageResource(R.drawable.pancakes);
        }

    }
}
