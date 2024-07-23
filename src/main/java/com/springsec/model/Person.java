package com.springsec.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    private Long id;
    private String name;
    private String lastName;
    private Double balance;

}
