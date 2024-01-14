package com.xworkz.comparator;


import java.util.Comparator;

import com.xworkz.dto.RefillDTO;

public class RefillBrandComparatorAsce implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}