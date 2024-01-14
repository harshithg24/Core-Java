package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerBluetoothComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Boolean.compare(o1.isBluetooth(),o2.isBluetooth());
    }
}