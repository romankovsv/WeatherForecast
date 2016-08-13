package com.weather;

import com.google.gson.annotations.SerializedName;

public class WeatherDetails {

    @SerializedName("main")
    private WeatherStatus status;

    public WeatherStatus getStatus(){
        return status;
    }
}
