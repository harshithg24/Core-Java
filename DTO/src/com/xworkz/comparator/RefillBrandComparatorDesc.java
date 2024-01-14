package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillBrandComparatorDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
 