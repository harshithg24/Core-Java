package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.WaterPurifierDTO;

public class WaterPurifierNameComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }
}