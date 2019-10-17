package com.example.foodparcels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View pancakeView = findViewById(R.id.pancakeView);
        View burgerView = findViewById(R.id.burgerView);
        View saladView = findViewById(R.id.saladView);
        View sandwichView = findViewById(R.id.sandwichView);

        pancakeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;

                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                number = 0;
                i.putExtra("FoodKey", number);

                startActivity(i);
            }
        });

        burgerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;

                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                number = 1;
                i.putExtra("FoodKey",number);

                startActivity(i);
            }
        });

        saladView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;

                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                number = 2;
                i.putExtra("FoodKey",number);

                startActivity(i);
            }
        });

        sandwichView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number;

                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                number = 3;
                i.putExtra("FoodKey",number);

                startActivity(i);
            }
        });
    }

}
