package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CoverDTO;

public class CoverCostComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}