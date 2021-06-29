package io.n0x.android.java_mot_testing.ex9;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import io.n0x.android.java_mot_testing.R;

public class FractionCalculator extends Activity{

    private static final String TAG = FractionCalculator.class.getName();

    private TextView txt_enum_left;
    private TextView txt_denom_left;
    private TextView txt_enum_right;
    private TextView txt_denom_right;
    private TextView txt_enum_result;
    private TextView txt_denom_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex9_data_binding);
        Log.d(TAG, "FractionCalculator started");

        /*
        txt_enum_left = (TextView) findViewById(R.id.txt_enum_left);
        txt_denom_left = (TextView) findViewById(R.id.txt_denom_left);
        txt_enum_right = (TextView) findViewById(R.id.txt_enum_right);
        txt_denom_right = (TextView) findViewById(R.id.txt_denom_right);
        txt_enum_result = (TextView) findViewById(R.id.txt_enum_result);
        txt_denom_result = (TextView) findViewById(R.id.txt_denom_result);

        // Set all fields to 0
        txt_enum_left.setText("0");
        txt_denom_left.setText("0");
        txt_enum_right.setText("0");
        txt_denom_right.setText("0");
        txt_enum_result.setText("0");
        txt_denom_result.setText("0");
        //*/

    }

    @Override
    protected void onStart() {
        super.onStart();



    }
}
