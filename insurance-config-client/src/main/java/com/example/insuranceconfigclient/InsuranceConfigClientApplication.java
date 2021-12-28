package com.example.insuranceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
public class InsuranceConfigClientApplication {
	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigClientApplication.class, args);
	}



}
