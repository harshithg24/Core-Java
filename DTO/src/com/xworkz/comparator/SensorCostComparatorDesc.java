package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SensorDTO;

public class SensorCostComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}
