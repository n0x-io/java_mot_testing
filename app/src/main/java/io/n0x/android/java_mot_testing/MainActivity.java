package io.n0x.android.java_mot_testing;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import io.n0x.android.java_mot_testing.databinding.Ex9DataBindingBinding;
import io.n0x.android.java_mot_testing.helper.Converter;

public class MainActivity extends AppCompatActivity{
    // For debugging
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Local calculator instance
        FractionCalculator calc = new FractionCalculator();

        // set a value for testing
        calc.setEnumResult(0);
        calc.setDenomResult(0);

        // Bind instance of FractionCalculator to view
        Ex9DataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.ex9_data_binding);
        binding.setCalc(calc);
        // set initial value for the arithmetical method
        calc.setArithMethod(FractionCalculator.ARTIH.ADD);

        /*
        // Converter to get null values
        Converter conv = new Converter();
        binding.setConv(conv);
        //*/

        // Log create action
        Log.d(TAG, "MainActivity started");
    }
}