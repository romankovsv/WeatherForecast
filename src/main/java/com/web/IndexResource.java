package com.web;
import com.weather.Forecast;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/")
public class IndexResource {


    /*@GET
    @Path("/{city}/{region}")
    public static Forecast getIndex(@PathParam("city") String city,
        @PathParam("region") String region){

        return getWeather(city, region);


    }*/
}
