package com.example.foodparcels;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowImgActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimg);

        ImageView image = findViewById(R.id.foodImgView);
        TextView text = findViewById(R.id.foodTextView);
        Resources res = getResources();

        Intent intent = getIntent();

        int number = intent.getIntExtra("FoodKey", 0);

        switch (number) {
            case 0:
                image.setImageResource(R.drawable.pancakes);
                text.setText(res.getString(R.string.pancakes_intro));
                break;
            case 1:
                image.setImageResource(R.drawable.burger);
                text.setText(res.getString(R.string.burger_intro));
                break;
            case 2:
                image.setImageResource(R.drawable.salad);
                text.setText(res.getString(R.string.salad_intro));
                break;
            case 3:
                image.setImageResource(R.drawable.sandwich);
                text.setText(res.getString(R.string.sandwich_intro));
                break;
        }
    }
}
