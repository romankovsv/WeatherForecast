package com.rest;

import com.weather.WeatherDetails;
import retrofit.http.GET;
import retrofit.http.Query;

public interface OpenWeatherClient {

    @GET("/data/2.5/forecast/city")
    WeatherDetails getWeather(@Query("id")String query);
}
