package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.Paper;

public class FloatComparatorAsc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		
		return Float.compare(o1.getThickness(), o2.getThickness());
	}
	
	

}
