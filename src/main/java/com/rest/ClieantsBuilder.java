package com.rest;

import retrofit.RestAdapter;

public class ClieantsBuilder {

    public static RestAdapter adapter;

    public static OpenWeatherClient getOpenWeatherClient(){
        adapter = new RestAdapter.Builder()
                .setEndpoint("http://api.openweathermap.org")
                .build();
        return adapter.create(OpenWeatherClient.class);
    }
}
