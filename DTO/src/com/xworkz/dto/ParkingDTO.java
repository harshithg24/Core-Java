package com.xworkz.dto;


import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class ParkingDTO implements Serializable {

    private String type;
    private String placeName;
    private int noOfParkedVehicles;
    private double costForParking;
}
