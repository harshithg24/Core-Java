package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CoverDTO;

public class CoverTypeComparatorAsce implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o1.getColor().compareTo(o2.getType());
    }
}
 