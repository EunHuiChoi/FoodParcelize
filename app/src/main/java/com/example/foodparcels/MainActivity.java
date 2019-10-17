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

        View burgerView = findViewById(R.id.burgerView);
        View pancakeView = findViewById(R.id.pancakeView);
        View saladView = findViewById(R.id.saladView);
        View sandwichView = findViewById(R.id.sandwichView);

//        final Intent intent = new Intent(this, ShowImgActivity.class);
//        startActivity(intent);

        burgerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                startActivity(i);
                i.putExtra("BurgerKey",1);
            }
        });

        pancakeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                startActivity(i);
                i.putExtra("PancakeKey",0);
            }
        });

        saladView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                startActivity(i);
            }
        });

        sandwichView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
                startActivity(i);
            }
        });
    }

}
