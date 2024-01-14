package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SensorDTO;

public class SensorDistanceComparatorAsce implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o1.getDistance(),o2.getDistance());
    }
}
