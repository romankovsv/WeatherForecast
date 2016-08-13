package com;

import com.rest.ClieantsBuilder;
import com.rest.OpenWeatherClient;
import com.weather.WeatherDetails;

public class Main {

    public static void main(String[] args) {


        OpenWeatherClient client = ClieantsBuilder.getOpenWeatherClient();

        //http://api.openweathermap.org/data/2.5/forecast/city?id=524901&APPID={APIKEY}

        //api.openweathermap.org/data/2.5/forecast/city?id=524901&APPID=1111111111

        WeatherDetails details = client.getWeather("524901&APPID=e36bea2388c2b288f273acfe5f98d8f0");

        double temperature = details.getStatus().getTemperature();

        System.out.println(temperature);
    }




}
