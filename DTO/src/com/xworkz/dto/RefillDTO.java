package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class RefillDTO implements Serializable {

    private String brand;
    private double cost;
    private int quantity;
    private String color;
}


