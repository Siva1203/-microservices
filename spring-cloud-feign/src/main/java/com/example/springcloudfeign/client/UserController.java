package com.example.springcloudfeign.client;

import com.example.springcloudfeign.dto.Todo;
import com.example.springcloudfeign.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/findAllUser")
    public List<UserResponse> getAllUser(){
        return userClient.getUsers();
    }

    @GetMapping("/findTodo")
    public List<Todo> getTodo(){
        return userClient.getTodos();
    }
}
