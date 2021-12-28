package com.example.singlesignon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SingleSignOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleSignOnApplication.class, args);
	}

	@GetMapping("/")
	public String welcome(Principal principal){
		return "Hi " + principal.getName()+ " Welcome to Siva home";
	}

}
