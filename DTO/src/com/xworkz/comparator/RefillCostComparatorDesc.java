package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillCostComparatorDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}