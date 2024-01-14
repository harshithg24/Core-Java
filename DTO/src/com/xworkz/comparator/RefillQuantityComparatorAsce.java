package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillQuantityComparatorAsce implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}