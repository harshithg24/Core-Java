package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.WaterPurifierDTO;

public class WaterPurifierCapacityComparatorDesc implements Comparator<WaterPurifierDTO> {

    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o2.getCapacity(), o1.getCapacity());
    }
}