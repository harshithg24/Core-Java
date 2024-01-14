package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CoverDTO;

public class CoverColorComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o2.getColor().compareTo(o1.getColor());
    }
}