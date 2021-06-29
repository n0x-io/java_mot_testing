package io.n0x.android.java_mot_testing;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class FractionCalculator extends BaseObservable{

    private static final String TAG = FractionCalculator.class.getName();

    private String denomLeft;
    private String enumLeft;
    private String denomRight;
    private String enumRight;
    private String denomResult;
    private String enumResult;

    public FractionCalculator(){
        Log.d(TAG, "new FractionCalculator created");
    }

    /// #### GETTER AND SETTER ####
    @Bindable
    public String getDenomLeft() {
        return denomLeft;
    }

    public void setDenomLeft(String denomLeft) {
        this.denomLeft = denomLeft;
        notifyPropertyChanged(BR.denomLeft);
    }

    @Bindable
    public String getEnumLeft() {
        return enumLeft;
    }

    public void setEnumLeft(String enumLeft) {
        this.enumLeft = enumLeft;
        notifyPropertyChanged(BR.enumLeft);
    }

    @Bindable
    public String getDenomRight() {
        return denomRight;
    }

    public void setDenomRight(String denomRight) {
        this.denomRight = denomRight;
        notifyPropertyChanged(BR.denomRight);
    }

    @Bindable
    public String getEnumRight() {
        return enumRight;
    }

    public void setEnumRight(String enumRight) {
        this.enumRight = enumRight;
        notifyPropertyChanged(BR.enumRight);
    }

    @Bindable
    public String getDenomResult() {
        return denomResult;
    }

    public void setDenomResult(String denomResult) {
        this.denomResult = denomResult;
        notifyPropertyChanged(BR.denomResult);
    }

    @Bindable
    public String getEnumResult() {
        return enumResult;
    }

    public void setEnumResult(String enumResult) {
        this.enumResult = enumResult;
        notifyPropertyChanged(BR.enumResult);
    }
}
