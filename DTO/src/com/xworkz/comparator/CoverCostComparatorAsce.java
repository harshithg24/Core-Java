package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CoverDTO;

public class CoverCostComparatorAsce implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}