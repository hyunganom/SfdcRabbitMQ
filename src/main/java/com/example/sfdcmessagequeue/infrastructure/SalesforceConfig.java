package com.example.sfdcmessagequeue.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SalesforceConfig {

    @Autowired
    private Environment env;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public String apiUrl() {
        return env.getProperty("salesforce.api.url");
    }

    @Bean
    public String accessToken() {
        return env.getProperty("salesforce.access.token");
    }
}
