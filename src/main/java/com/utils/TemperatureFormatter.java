package com.utils;

public class TemperatureFormatter {

    public static String format(double value, String measure){

        String sign = value < 0 ? "-" : "+";

        return String.format("%s%s%s",sign, (int)Math.round(value),measure);
    }
}
