package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.ParkingDTO;

public class ParkingPlaceNameComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o2.getPlaceName().compareTo(o1.getPlaceName());
    }
}