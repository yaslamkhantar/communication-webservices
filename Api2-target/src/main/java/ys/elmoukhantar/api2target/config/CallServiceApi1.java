package ys.elmoukhantar.api2target.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Data
public class CallServiceApi1 {

    private String baseurl;
}
