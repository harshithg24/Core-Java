package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SensorDTO;

public class SensorDistanceComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o2.getDistance(), o1.getDistance());
    }
}
