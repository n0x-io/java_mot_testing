package io.n0x.android.java_mot_testing.helper;

import androidx.databinding.InverseMethod;

public class Converter {
    @InverseMethod("toInt")
    public static String toString(int val){
        if(val == 0){
            return null;
        }
        return String.valueOf(val);
    }
    public static int toInt(String val){
        if(val == null || val.isEmpty())
            return 0;
        return Integer.parseInt(val);
    }
}
