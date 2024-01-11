package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.Paper;

public class IntComparatorDes implements Comparator<Paper>{
	
	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getHeight(), o1.getHeight());
	}

}

