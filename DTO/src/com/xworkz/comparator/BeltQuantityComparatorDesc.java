package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.BeltDTO;

public class BeltQuantityComparatorDesc implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Integer.compare(o2.getQuantity(),o1.getQuantity());
    }
}