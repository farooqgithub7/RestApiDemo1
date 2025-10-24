package com.example.RestApiDemo1.service;

import com.example.RestApiDemo1.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.baseurl}")
    private String baseUrl;


//    // Replace with your OpenWeatherMap API Key
//    private final String API_KEY = "440b9fc0e4cfac2ae3f594ba53df6b04";
//
//    // Base URL for the weather API
//    private final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public WeatherResponse getWeatherByCity(String city) {
        String url = String.format(baseUrl, city, apiKey);
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        return new WeatherResponse(response);
    }
}
