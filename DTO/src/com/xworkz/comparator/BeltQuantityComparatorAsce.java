package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.BeltDTO;

public class BeltQuantityComparatorAsce implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}
