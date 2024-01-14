package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class SparkPlugDTO implements Serializable {

    private String brand;
    private double cost;
    private String type;
    private int quantity;

}