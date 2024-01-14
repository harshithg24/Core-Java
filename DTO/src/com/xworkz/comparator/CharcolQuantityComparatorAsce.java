package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CharcoalDTO;

public class CharcolQuantityComparatorAsce implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}