package com.xworkz.comparator;


import java.util.Comparator;

import com.xworkz.dto.CoverDTO;

public class CoverThicknessComparatorAsce implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Boolean.compare(o1.isThickness(),o2.isThickness());
    }
}