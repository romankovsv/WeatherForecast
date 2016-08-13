package com.weather;

import com.google.gson.annotations.SerializedName;

public class WeatherDetails {

    @SerializedName("main")
    private WeatherStatus status;

    private String city;

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public WeatherStatus getStatus(){
        return status;
    }

    public void setStatus(WeatherStatus status){
        this.status = status;
    }
}
