package io.n0x.android.java_mot_testing;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FractionCalculator{

    private static final String TAG = FractionCalculator.class.getName();

    private int enumLeft;
    private int denomLeft;
    private int enumRight;
    private int denomRight;
    public int enumResult;
    public int denomResult;


    protected void doStuff() {
          Log.d(TAG, "FractionCalculator started");
    }

    public int getEnumLeft() {
        return enumLeft;
    }

    public void setEnumLeft(int enumLeft) {
        this.enumLeft = enumLeft;
    }

    public int getDenomLeft() {
        return denomLeft;
    }

    public void setDenomLeft(int denomLeft) {
        this.denomLeft = denomLeft;
    }

    public int getEnumRight() {
        return enumRight;
    }

    public void setEnumRight(int enumRight) {
        this.enumRight = enumRight;
    }

    public int getDenomRight() {
        return denomRight;
    }

    public void setDenomRight(int denomRight) {
        this.denomRight = denomRight;
    }

    // GETTER AND SETTER

}
