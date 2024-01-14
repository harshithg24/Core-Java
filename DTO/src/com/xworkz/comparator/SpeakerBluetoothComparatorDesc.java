package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.SpeakerDTO;

public class SpeakerBluetoothComparatorDesc implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Boolean.compare(o2.isBluetooth(),o1.isBluetooth());
    }
}