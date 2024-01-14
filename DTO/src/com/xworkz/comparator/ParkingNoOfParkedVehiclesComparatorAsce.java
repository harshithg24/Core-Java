package com.xworkz.comparator;


import java.util.Comparator;

import com.xworkz.dto.ParkingDTO;

public class ParkingNoOfParkedVehiclesComparatorAsce implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Integer.compare(o1.getNoOfParkedVehicles(),o2.getNoOfParkedVehicles());
    }
}