package com.example.foodparcels;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.Gravity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ShowImgActivity extends AppCompatActivity {

    EditText foodName;
    EditText foodUrl;
    EditText foodKeyword;
    DatePicker foodDate;
    EditText foodEmail;
    RatingBar foodRate;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimg);

        foodName = findViewById(R.id.name);
        foodUrl = findViewById(R.id.imgUrl);
        foodKeyword = findViewById(R.id.keywords);
        foodDate = findViewById(R.id.date);
        foodEmail = findViewById(R.id.email);
        foodRate = findViewById(R.id.rate);

        Food myFood  = getIntent().getParcelableExtra("FOOD");
        foodName.setText(myFood.getName());
        foodUrl.setText(myFood.getImgLocation());
        foodKeyword.setText(myFood.getKeywords());
        foodEmail.setText(myFood.getEmail());
        foodRate.setRating(myFood.getRating());

        int year;
        int month;
        int day;

        try {
            String strDate = myFood.getDate();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
            String strYear = (String) DateFormat.format("yyyy", date);
            String strMonth = (String) DateFormat.format("MM", date);
            String strDay = (String) DateFormat.format("dd", date);

            year = Integer.parseInt(strYear);
            month = Integer.parseInt(strMonth);
            day = Integer.parseInt(strDay);
            foodDate.updateDate(year,month-1, day);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void onModifyClick(View v) {


        String strFoodName = foodName.getText().toString();
        String strFoodEmail = foodEmail.getText().toString();

        if (TextUtils.isEmpty(strFoodName)) {
            Toast toast = Toast.makeText(this, "Name field Cannot be empty", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        if (TextUtils.isEmpty(strFoodEmail)) {
            Toast toast = Toast.makeText(this, "Email field Cannot be empty", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        int year = foodDate.getYear();
        int month = foodDate.getMonth();
        int day = foodDate.getDayOfMonth();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = format.format(calendar.getTime());

        Intent i = new Intent();
        Food food = new Food(foodName.getText().toString(), foodUrl.getText().toString(), foodKeyword.getText().toString(), formattedDate, foodEmail.getText().toString(), foodRate.getRating());
        i.putExtra("FoodData", food);
        setResult(RESULT_OK, i);
        finish();
    }
}
