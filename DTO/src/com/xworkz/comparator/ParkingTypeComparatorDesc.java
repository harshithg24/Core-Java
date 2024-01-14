package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.ParkingDTO;

public class ParkingTypeComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
