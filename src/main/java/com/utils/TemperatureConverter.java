package com.utils;


public class TemperatureConverter {

    private static final double KELVIN_CONST = 273.15;

    public static double celsiusToKelvin(double value){
        return value + KELVIN_CONST;
    }

    public static double kelvinToCelsius(double value){
        return value - KELVIN_CONST;
    }
}
