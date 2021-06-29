package io.n0x.android.java_mot_testing;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.security.InvalidParameterException;

public class FractionCalculator extends BaseObservable{
    // Debugging stuff
    private static final String TAG = FractionCalculator.class.getName();

    public enum ARTIH {ADD, SUBTRACT, MULTIPLICATE, DIVIDE};
    private ARTIH arithMethod;

    private String centerSign;

    private int denomLeft;
    private int enumLeft;
    private int denomRight;
    private int enumRight;
    private int denomResult;
    private int enumResult;

    public FractionCalculator(){
        Log.d(TAG, "new FractionCalculator created");
    }

    // Calculate the result
    // https://de.wikibooks.org/wiki/C%2B%2B-Programmierung/_Br%C3%BCche
    public void calculateResult(){
        if(denomLeft == 0 || denomRight == 0){
            Log.e(TAG, "Denominator cannot be 0");
        } else {
            switch (arithMethod) {
                case ADD:
                    denomResult = getLCM(denomLeft, denomRight);
                    enumResult = enumLeft * (denomResult / denomLeft) + enumRight * (denomResult / denomRight);
                    break;
                case SUBTRACT:
                    denomResult = getLCM(denomLeft, denomRight);
                    enumResult = enumLeft * (denomResult / denomLeft) - enumRight * (denomResult / denomRight);
                    break;
                case MULTIPLICATE:
                    denomResult = denomLeft * denomRight;
                    enumResult = enumLeft * enumRight;
                    break;
                case DIVIDE:
                    enumResult = enumLeft * denomRight;
                    denomResult = denomLeft * enumRight;
                    break;
            }
            // update the result variables
            notifyPropertyChanged(BR.denomResult);
            notifyPropertyChanged(BR.enumResult);
        }
    }

    // ####### HELPER METHODS #######
    // calculate greatest common divisor (Euclidean algorithm)
    private int getGCD(int a, int b){
        if(b==0){
            return a;
        } else {
            return getGCD(b,a % b);
        }
    }

    // calculate least common multiple
    private int getLCM(int a, int b){
        return (a*b)/getGCD(a,b);
    }
    // ####### END HELPER METHODS #######

    /// ####### GETTER AND SETTER #######
    public void setArithMethod(ARTIH arithMethod) {
        this.arithMethod = arithMethod;
        switch(arithMethod){
            case ADD:
                centerSign = "+";
                break;
            case SUBTRACT:
                centerSign = "-";
                break;
            case MULTIPLICATE:
                centerSign = "*";
                break;
            case DIVIDE:
                centerSign = "/";
                break;
        }
        // Update the sign in the middle of the screen
        notifyPropertyChanged(BR.centerSign);
    }

    @Bindable
    public int getDenomLeft() {
        return denomLeft;
    }

    public void setDenomLeft(int denomLeft) {
        this.denomLeft = denomLeft;
        notifyPropertyChanged(BR.denomLeft);
    }

    @Bindable
    public int getEnumLeft() {
        return enumLeft;
    }

    public void setEnumLeft(int enumLeft) {
        this.enumLeft = enumLeft;
        notifyPropertyChanged(BR.enumLeft);
    }

    @Bindable
    public int getDenomRight() {
        return denomRight;
    }

    public void setDenomRight(int denomRight) {
        this.denomRight = denomRight;
        notifyPropertyChanged(BR.denomRight);
    }

    @Bindable
    public int getEnumRight() {
        return enumRight;
    }

    public void setEnumRight(int enumRight) {
        this.enumRight = enumRight;
        notifyPropertyChanged(BR.enumRight);
    }

    @Bindable
    public int getDenomResult() {
        return denomResult;
    }

    public void setDenomResult(int denomResult) {
        this.denomResult = denomResult;
        notifyPropertyChanged(BR.denomResult);
    }

    @Bindable
    public int getEnumResult() {
        return enumResult;
    }

    public void setEnumResult(int enumResult) {
        this.enumResult = enumResult;
        notifyPropertyChanged(BR.enumResult);
    }

    @Bindable
    public String getCenterSign() {
        return centerSign;
    }

    /// ####### END GETTER AND SETTER #######
}
