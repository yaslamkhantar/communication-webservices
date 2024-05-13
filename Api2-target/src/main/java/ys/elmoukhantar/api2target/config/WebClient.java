package ys.elmoukhantar.api2target.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClient {
    @Bean
    public org.springframework.web.reactive.function.client.WebClient getWebClient() {
        return org.springframework.web.reactive.function.client.WebClient.builder().build();
    }
}
