package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.WaterPurifierDTO;

public class WaterPurifierCostComparatorDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o2.getCost(),o2.getCost());
    }
}