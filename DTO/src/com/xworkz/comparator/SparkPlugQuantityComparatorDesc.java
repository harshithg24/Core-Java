package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SparkPlugDTO;

public class SparkPlugQuantityComparatorDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Integer.compare(o2.getQuantity(),o1.getQuantity());
    }
}
