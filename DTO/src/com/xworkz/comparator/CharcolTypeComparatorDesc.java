package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CharcoalDTO;

public class CharcolTypeComparatorDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}