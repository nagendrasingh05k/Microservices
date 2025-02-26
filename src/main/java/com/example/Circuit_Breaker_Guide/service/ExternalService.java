package com.example.Circuit_Breaker_Guide.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalService {

    private final RestTemplate restTemplate = new RestTemplate();
    
    private static final String CIRCUIT_BREAKER_NAME = "myCircuitBreaker";

    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackResponse")
    public String getExternalData() {
        // Simulating an external service call
        String url = "https://jsonplaceholder.typicode.com/posts/1"; // Replace with an actual API
        return restTemplate.getForObject(url, String.class);
    }

    // Fallback method when the circuit breaker is open
    public String fallbackResponse(Exception e) {
        return "Fallback response: External service is unavailable";
    }
}
