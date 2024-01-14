package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerCostComparatorDesc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}