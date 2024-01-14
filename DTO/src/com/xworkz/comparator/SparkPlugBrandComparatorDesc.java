package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SparkPlugDTO;

public class SparkPlugBrandComparatorDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}