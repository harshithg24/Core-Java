package com.xworkz.comparator;


import java.util.Comparator;

import com.xworkz.dto.BeltDTO;

public class BeltLengthComparatorAsce implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getLength(), o2.getLength());
    }
}