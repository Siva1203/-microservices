package com.example.userapp;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-app")
public interface UserApp {

public String getChat() {

}
}
