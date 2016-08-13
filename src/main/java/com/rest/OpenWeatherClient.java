package com.rest;

import com.weather.WeatherDetails;
import retrofit.http.GET;
import retrofit.http.Query;

public interface OpenWeatherClient {

    //api.openweathermap.org/data/2.5/forecast/city?id=524901&APPID=e36bea2388c2b288f273acfe5f98d8f0

    //http://api.openweathermap.org/data/2.5/weather/?id=524901&APPID=e36bea2388c2b288f273acfe5f98d8f0
    //http://api.openweathermap.org/data/2.5/weather/?q=London,uk&APPID=e36bea2388c2b288f273acfe5f98d8f0
    @GET("/data/2.5/forecast/city")
    WeatherDetails getWeather(@Query("id")String query);
}
