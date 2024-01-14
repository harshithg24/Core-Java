package com.xworkz.comparator;


import java.util.Comparator;

import com.xworkz.dto.SensorDTO;

public class SensorTypeComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
