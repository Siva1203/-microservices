package com.example.springcloudfeign.client;

import com.example.springcloudfeign.dto.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/rest-api")
public class UserControllerRest {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;


    @GetMapping("/getRestUsers")
    public List<Object> getRestUsers(){
        return (List<Object>)  webClientBuilder.build().get().uri("https://jsonplaceholder.typicode.com/users").retrieve().bodyToMono(Object.class).block();

    }

    @GetMapping("/getRestTodos")
    public List<Object> getRestTodos(){
        return (List<Object>) restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos",Object.class);
    }

}
