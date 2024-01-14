package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.ParkingDTO;

public class ParkingTypeComparatorAsce implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
