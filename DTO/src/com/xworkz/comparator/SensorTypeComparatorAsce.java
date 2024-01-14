package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SensorDTO;

public class SensorTypeComparatorAsce implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o1.getType().compareTo(o2.getName());
    }
}