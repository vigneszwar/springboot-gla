package com.demo.springbootservice.Model;

import lombok.*;

@Setter
@Getter
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
