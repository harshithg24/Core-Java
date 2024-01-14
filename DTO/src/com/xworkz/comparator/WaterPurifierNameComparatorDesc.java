package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.WaterPurifierDTO;

public class WaterPurifierNameComparatorDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return o2.getName().compareTo(o1.getName());
    }
}