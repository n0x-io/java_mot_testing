package io.n0x.android.java_mot_testing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getName();



    FractionCalculator calc = new FractionCalculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex9_data_binding);
        Log.d(TAG, "MainActivity started");


         // Button Listeners
        findViewById(R.id.button_add).setOnClickListener(this);

        calc.doStuff();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_add) {

            TextView textView = findViewById(R.id.txt_enum_result);
            textView.setText("10");

            calc.enumResult = 5;
            calc.denomResult = 6;

            //calc.setDenomLeft(10);
/*
            enumLeft = 1;
            denomLeft = 2;
            enumRight = 3;
            denomRight = 4;


 //*/
        }
    }
}