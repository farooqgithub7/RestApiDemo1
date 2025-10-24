package com.example.RestApiDemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    // RestTemplate bean to make external API calls
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

