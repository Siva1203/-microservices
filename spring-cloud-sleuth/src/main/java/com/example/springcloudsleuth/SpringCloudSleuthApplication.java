package com.example.springcloudsleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
@RequestMapping("/payment-service")
public class SpringCloudSleuthApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringCloudSleuthApplication.class);

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getDiscount")
	public String getDiscount(){
		log.info("discount service called...");
		return "added discount 15%";
	}

	@GetMapping("/payment")
	public String payment(){
		log.info("payment service called with discount...");
		return restTemplate.getForObject("http://localhost:8080/payment-service/getDiscount",String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSleuthApplication.class, args);
	}

}
