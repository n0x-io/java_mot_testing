package io.n0x.android.java_mot_testing;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import io.n0x.android.java_mot_testing.ex9.FractionCalculator;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, FractionCalculator.class);
        startActivity(intent);
    }
}