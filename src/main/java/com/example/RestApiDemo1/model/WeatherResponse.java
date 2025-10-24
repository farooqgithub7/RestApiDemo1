package com.example.RestApiDemo1.model;


import java.util.Map;

public class WeatherResponse {

    private Map<String, Object> data;

    public WeatherResponse(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
