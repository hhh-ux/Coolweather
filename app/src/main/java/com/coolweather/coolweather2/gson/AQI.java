package com.coolweather.coolweather2.gson;

public class AQI {

    /**
     * "aqi":{
     *     "aqi":44
     *     "pm25":"13"
     * }
     */

    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
