package com.xworkz.comparator;


import java.util.Comparator;

import com.xworkz.dto.CharcoalDTO;

public class CharcolBrandComparatorAsce implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}