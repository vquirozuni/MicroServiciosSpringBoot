package com.tutorial.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    //Crear un bean
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
