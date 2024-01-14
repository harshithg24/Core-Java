package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SensorDTO;

public class SensorNameComparatorAsce implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
