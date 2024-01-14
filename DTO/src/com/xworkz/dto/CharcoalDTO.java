package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class CharcoalDTO implements Serializable {

    private int quantity;
    private String type;
    private String brand;
    private double cost;

}