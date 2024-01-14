package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CoverDTO;

public class CoverThicknessComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Boolean.compare(o2.isThickness(),o1.isThickness());
    }
}
