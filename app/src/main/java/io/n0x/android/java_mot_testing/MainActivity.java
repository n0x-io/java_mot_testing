package io.n0x.android.java_mot_testing;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // create calculator instance
        calc = new FractionCalculator();

        // set a value for testing
        calc.setEnumResult("0");
        calc.setDenomResult("0");

        // Bind instance of FractionCalculator to view
        Ex9DataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.ex9_data_binding);
        binding.setCalc(calc);

        // Button Listeners
        findViewById(R.id.button_add).setOnClickListener(this);

        // Log create action
        Log.d(TAG, "MainActivity started");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_add) {

            // works (without using bindings)
            TextView textView = findViewById(R.id.txt_enum_result);
            textView.setText("1234");

            // work with DataBinding
            calc.setDenomLeft("123123123");
        }
    }
}