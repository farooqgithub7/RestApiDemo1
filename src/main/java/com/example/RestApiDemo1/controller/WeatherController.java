package com.example.RestApiDemo1.controller;

import com.example.RestApiDemo1.model.WeatherResponse;
import com.example.RestApiDemo1.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    // Example: GET http://localhost:8080/api/weather/Bangalore
    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }

    // Simple test endpoint to check app is running
    @GetMapping("/check")
    public String checkApp() {
        return "✅ Weather API Application is running successfully!";
    }
}
