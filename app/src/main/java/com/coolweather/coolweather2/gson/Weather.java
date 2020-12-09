package com.coolweather.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    /**
     * {
     *     "HeWeather":{
     *         "status":"ok"
     *         "basic":{}
     *         "aqi':{}
     *         "now":{}
     *         "suggestion":{}
     *         "daily_forecast":[]
     *     }
     * }
     */

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
