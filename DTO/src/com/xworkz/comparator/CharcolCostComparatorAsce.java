package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CharcoalDTO;

public class CharcolCostComparatorAsce implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}