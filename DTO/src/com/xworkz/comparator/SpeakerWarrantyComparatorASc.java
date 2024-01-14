package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerWarrantyComparatorASc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o1.getWarranty(),o2.getWarranty());
    }
}
