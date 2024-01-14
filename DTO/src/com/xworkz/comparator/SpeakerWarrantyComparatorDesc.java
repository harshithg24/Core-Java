package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerWarrantyComparatorDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getWarranty(),o1.getWarranty());
    }
}