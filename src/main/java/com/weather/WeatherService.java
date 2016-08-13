package com.weather;

import com.rest.OpenWeatherClient;

public class WeatherService {
    private static final String openWeatherMapKey = "e36bea2388c2b288f273acfe5f98d8f0";

    OpenWeatherClient client;

    public WeatherService(OpenWeatherClient client){
        this.client = client;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private double temperature;
    private String city;


    public WeatherDetails getWeather(String city, String region){
       return client.getWeather(city+region+"524901&APPID="+openWeatherMapKey);
    }



}
