package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.BeltDTO;

public class BeltColorComparatorAsce implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}