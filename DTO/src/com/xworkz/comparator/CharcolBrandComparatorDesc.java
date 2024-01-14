package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.CharcoalDTO;

public class CharcolBrandComparatorDesc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
