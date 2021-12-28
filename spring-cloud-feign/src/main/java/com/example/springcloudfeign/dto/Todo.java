package com.example.springcloudfeign.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Todo {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

}
