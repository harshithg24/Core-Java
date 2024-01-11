package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.Paper;

public class AscComparator implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		return o1.getType().compareToIgnoreCase(o2.getType());
	}

	


	
}
