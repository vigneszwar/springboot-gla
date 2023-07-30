package com.example.springflightdemo.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Flight {
    private String name;
    private String src;
    private String dest;
    private String departure;
    private String arrival;
}
