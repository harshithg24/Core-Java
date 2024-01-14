package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SparkPlugDTO;

public class SparkPlugCostComparatorDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
