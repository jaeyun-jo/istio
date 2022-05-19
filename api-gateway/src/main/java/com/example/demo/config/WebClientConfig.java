package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${account-url}")
    private String accountUrl;

    @Value("${treatment-url}")
    private String treatmenturl;

    @Value("${payment-url}")
    private String paymentUrl;

    @Bean
    public WebClient accountClient() {
        return WebClient.builder()
                        .baseUrl(accountUrl)
                        .build();
    }

    @Bean
    public WebClient treatmentClient() {
        return WebClient.builder()
                        .baseUrl(treatmenturl)
                        .build();
    }

    @Bean
    public WebClient paymentClient() {
        return WebClient.builder()
                        .baseUrl(paymentUrl)
                        .build();
    }
}
