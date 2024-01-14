package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerNameComparatorDesc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return o2.getName().compareTo(o1.getName());
    }
}