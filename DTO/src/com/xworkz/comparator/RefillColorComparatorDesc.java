package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillColorComparatorDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return o2.getColor().compareTo(o1.getColor());
    }
}