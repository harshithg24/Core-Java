package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.WaterPurifierDTO;

public class WaterPurifierColorComparatorAsc implements Comparator<WaterPurifierDTO> {

    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}