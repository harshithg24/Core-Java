package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CharcoalDTO;

public class CharcolQuantityComparatorDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}