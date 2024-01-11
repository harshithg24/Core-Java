package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.Paper;

public class FloatComparatorDes implements Comparator<Paper>{
	
	@Override
	public int compare(Paper o1, Paper o2) {
		
		return Float.compare(o2.getThickness(), o1.getThickness());
	}

}
