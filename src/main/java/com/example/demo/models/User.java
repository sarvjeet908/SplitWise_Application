package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String hashedPassword;
    private String phoneNumber;
}
