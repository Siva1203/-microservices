package com.example.insuranceconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class insuranceController {
    @Autowired
    private RestTemplate template;

    @Value("${insurance.provider.url}")
    private String url;

    @GetMapping("/getPlans")
    public List<String> getPlans(){
        List<String> plans = template.getForObject(url, List.class);
        return  plans;
    }

}
