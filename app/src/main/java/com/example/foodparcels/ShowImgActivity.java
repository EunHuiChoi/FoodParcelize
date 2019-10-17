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

        int number = intent.getIntExtra("FoodKey", 0);

        switch (number) {
            case 0:
                image.setImageResource(R.drawable.pancakes);
                break;
            case 1:
                image.setImageResource(R.drawable.burger);
                break;
            case 2:
                image.setImageResource(R.drawable.salad);
                break;
            case 3:
                image.setImageResource(R.drawable.sandwich);
                break;
        }
    }
}
