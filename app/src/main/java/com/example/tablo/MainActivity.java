package com.example.tablo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Integer counterR = 0;
    private Integer counterUSA = 0;
    private static final String KEY_COUNTERR = "COUNT";
    private static final String KEY_COUNTERUSA = "COUNT";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null)
        {
            counterR = savedInstanceState.getInt(KEY_COUNTERR, 0);
            counterUSA = savedInstanceState.getInt(KEY_COUNTERUSA, 0);
            TextView counterRView =  findViewById(R.id.textR);
            counterRView.setText(counterR.toString());
            TextView counterUSAView =  findViewById(R.id.textUSA);
            counterUSAView.setText(counterUSA.toString());
        }


    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTERR, counterR);
        outState.putInt(KEY_COUNTERUSA, counterUSA);
    }

    @SuppressLint("SetTextI18n")
    public void ClickButR(View view)
    {
        counterR++;
        TextView counterRView = findViewById(R.id.textR);
        counterRView.setText(counterR.toString());
    }

    @SuppressLint("SetTextI18n")
    public void ClickButUSA(View view)
    {
        counterUSA++;
        TextView counterUSAView = findViewById(R.id.textUSA);
        counterUSAView.setText(counterUSA.toString());
    }

    @SuppressLint("SetTextI18n")
    public void ClickButSbros(View view)
    {
        counterR = 0;
        counterUSA = 0;
        TextView counterUSAView = findViewById(R.id.textUSA);
        counterUSAView.setText(counterUSA.toString());
        TextView counterRView = findViewById(R.id.textR);
        counterRView.setText(counterR.toString());
    }
}