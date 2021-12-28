package com.example.springbootconsul;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
@Data
@Getter
@Setter
public class MyConfig {

    private String username;
    private String password;
}
