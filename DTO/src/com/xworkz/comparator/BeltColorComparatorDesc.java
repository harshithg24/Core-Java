package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.BeltDTO;

public class BeltColorComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o2.getColor().compareTo(o1.getColor());
    }
}
