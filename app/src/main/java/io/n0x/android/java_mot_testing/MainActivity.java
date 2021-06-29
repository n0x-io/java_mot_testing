package io.n0x.android.java_mot_testing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import io.n0x.android.java_mot_testing.databinding.Ex9DataBindingBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // For debugging
    private static final String TAG = MainActivity.class.getName();
    // Local calculator instance
    private FractionCalculator calc;

    private int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // create calculator instance
        calc = new FractionCalculator();

        // set a value for testing
        calc.setEnumResult(0);
        calc.setDenomResult(0);

        // Bind instance of FractionCalculator to view
        Ex9DataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.ex9_data_binding);
        binding.setCalc(calc);

        // Button Listeners
        findViewById(R.id.button_add).setOnClickListener(this);
        findViewById(R.id.button_sub).setOnClickListener(this);
        findViewById(R.id.button_mult).setOnClickListener(this);
        findViewById(R.id.button_div).setOnClickListener(this);
        findViewById(R.id.button_calc).setOnClickListener(this);

        // Log create action
        Log.d(TAG, "MainActivity started");
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_add:
                calc.setArithMethod(FractionCalculator.ARTIH.ADD);
                break;
            case R.id.button_sub:
                calc.setArithMethod(FractionCalculator.ARTIH.SUBTRACT);
                break;
            case R.id.button_mult:
                calc.setArithMethod(FractionCalculator.ARTIH.MULTIPLICATE);
                break;
            case R.id.button_div:
                calc.setArithMethod(FractionCalculator.ARTIH.DIVIDE);
                break;
            case R.id.button_calc:
                calc.calculateResult();
                break;
        }
    }
}