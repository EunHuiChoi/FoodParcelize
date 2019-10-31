package com.example.foodparcels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Food pancake = new Food("Pancake", "www.google.com", "My favorite", "2018-08-28","eun95828@gmail.com",5f);
    Food burger = new Food("Burger", "www.naver.com", "Betty's Burger","2001-01-11","iamehchoi@gmail.com",3f);
    Food salad = new Food("Salad", "www.daum.net", "Healthy Food","2019-10-13","sji089@naver.com",1f);
    Food sandwich = new Food("Sandwich", "www.stacoverflow.com", "Club Sandwich","2014-12-02","github@likelion.org",4f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pancakeName = findViewById(R.id.pancakeTextView);
        pancakeName.setText(pancake.getName());
        TextView pancakeDate = findViewById(R.id.pancakeDate);
        pancakeDate.setText(pancake.getDate());

        TextView burgerName = findViewById(R.id.burgerTextView);
        burgerName.setText(burger.getName());
        TextView burgerDate = findViewById(R.id.burgerDate);
        burgerDate.setText(burger.getDate());

        TextView saladName = findViewById(R.id.saladTextView);
        saladName.setText(salad.getName());
        TextView saladDate = findViewById(R.id.saladDate);
        saladDate.setText(salad.getDate());

        TextView sandwichName = findViewById(R.id.sandwichTextView);
        sandwichName.setText(sandwich.getName());
        TextView sandwichDate = findViewById(R.id.sandwichDate);
        sandwichDate.setText(sandwich.getDate());
    }

    public void onPancakeBtn(View v) {
        Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
        i.putExtra("FOOD", pancake);
        startActivityForResult(i, 0);
    }

    public void onBurgerBtn(View V) {
        Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
        i.putExtra("FOOD", burger);
        startActivityForResult(i, 1);
    }

    public void onSaladBtn(View V) {
        Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
        i.putExtra("FOOD", salad);
        startActivityForResult(i, 2);
    }

    public void onSandwichBtn(View V) {
        Intent i = new Intent(getApplicationContext(), ShowImgActivity.class);
        i.putExtra("FOOD", sandwich);
        startActivityForResult(i, 3);
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                if (intent == null) {
                    Log.i("INTENT", "Intent empty");
                } else {
                    pancake = intent.getParcelableExtra("FoodData");
                    TextView pancakeName = findViewById(R.id.pancakeTextView);
                    pancakeName.setText(pancake.getName());
                    TextView pancakeDate = findViewById(R.id.pancakeDate);
                    pancakeDate.setText(pancake.getDate());
                }
            } else Log.i("INTENT", "Result not okay");
        } else Log.i("INTENT", "Code does not match");

        if(requestCode == 1) {
            if (resultCode == RESULT_OK) {
                if (intent == null) {
                    Log.i("INTENT", "Intent empty");
                } else {
                    burger = intent.getParcelableExtra("FoodData");
                    TextView burgerName = findViewById(R.id.burgerTextView);
                    burgerName.setText(burger.getName());
                    TextView burgerDate = findViewById(R.id.burgerDate);
                    burgerDate.setText(burger.getDate());
                }
            } else Log.i("INTENT", "Result not okay");
        } else Log.i("INTENT", "Code does not match");

        if(requestCode == 2) {
            if (resultCode == RESULT_OK) {
                if (intent == null) {
                    Log.i("INTENT", "Intent empty");
                } else {
                    salad = intent.getParcelableExtra("FoodData");
                    TextView saladName = findViewById(R.id.saladTextView);
                    saladName.setText(salad.getName());
                    TextView saladDate = findViewById(R.id.saladDate);
                    saladDate.setText(salad.getDate());
                }
            } else Log.i("INTENT", "Result not okay");
        } else Log.i("INTENT", "Code does not match");

        if(requestCode == 3) {
            if (resultCode == RESULT_OK) {
                if (intent == null) {
                    Log.i("INTENT", "Intent empty");
                } else {
                    sandwich = intent.getParcelableExtra("FoodData");
                    TextView sandwichName = findViewById(R.id.sandwichTextView);
                    sandwichName.setText(sandwich.getName());
                    TextView sandwichDate = findViewById(R.id.sandwichDate);
                    sandwichDate.setText(sandwich.getDate());
                }
            } else Log.i("INTENT", "Result not okay");
        } else Log.i("INTENT", "Code does not match");
    }

}
