package com.weather;

import com.google.gson.annotations.SerializedName;

public class WeatherStatus {

    @SerializedName("temp")
    private double temperature;

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
}
