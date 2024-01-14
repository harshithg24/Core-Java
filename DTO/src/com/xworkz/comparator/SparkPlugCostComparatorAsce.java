package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SparkPlugDTO;

public class SparkPlugCostComparatorAsce implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}