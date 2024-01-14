package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.WaterPurifierDTO;

public class WaterPurifierCostComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}