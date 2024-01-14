package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillCostComparatorAsce implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}