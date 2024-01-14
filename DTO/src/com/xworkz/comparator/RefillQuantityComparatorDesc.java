package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillQuantityComparatorDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o2.getQuantity(),o1.getQuantity());
    }
}