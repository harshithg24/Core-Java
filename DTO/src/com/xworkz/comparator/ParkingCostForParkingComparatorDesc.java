package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.ParkingDTO;

public class ParkingCostForParkingComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getCostForParking(),o1.getCostForParking());
    }
}
