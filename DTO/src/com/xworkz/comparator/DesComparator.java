package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.Paper;

public class DesComparator implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		return o2.getType().compareToIgnoreCase(o1.getType());
	}

	
	

}
