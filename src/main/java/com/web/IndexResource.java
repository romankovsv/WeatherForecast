package com.web;
import com.weather.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/")
public class IndexResource {


    /*@GET
    @Path("/{city}/{region}")
    @Template(name="index.ftl")
    public static Weather getIndex(@PathParam("city") String city,
        @PathParam("region") String region){

        return getWeather(city, region);


    }*/
}
