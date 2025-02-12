package com.nishintgoyal.prod_ready_features2025.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Configuration
public class RestClientConfig
{
    @Value("${employeeService.base.url}")
    private String Base_url;

    @Bean
    @Qualifier("employeeRestClient")
    RestClient getEmployeeServiceRestClient()
    {
        return RestClient.builder()
                .baseUrl(Base_url)
                .defaultHeader(CONTENT_TYPE,APPLICATION_JSON_VALUE)
                .build();
    }
}
