package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SparkPlugDTO;

public class SparkPlugTypeComparatorDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}