package com;

import com.rest.ClieantsBuilder;
import com.rest.OpenWeatherClient;
import com.weather.WeatherDetails;

public class Main {
    private static final String openWeatherMapKey = "e36bea2388c2b288f273acfe5f98d8f0";

    public static void main(String[] args) {

        OpenWeatherClient client = ClieantsBuilder.getOpenWeatherClient();

        WeatherDetails details = client.getWeather("524901&APPID="+openWeatherMapKey);

        double temperature = details.getStatus().getTemperature();

        System.out.println(temperature);
    }




}
