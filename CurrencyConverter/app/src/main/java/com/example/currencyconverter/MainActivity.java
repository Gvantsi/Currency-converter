package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        Double GeorgianLariAmount = dollarAmountDouble * 3.31;

        Toast.makeText(MainActivity.this, "GEL" + String.format("%.2f", GeorgianLariAmount), Toast.LENGTH_SHORT).show();

        Log.i("Amount", dollarAmountEditText.getText().toString());


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}