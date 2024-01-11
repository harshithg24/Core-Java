package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.dto.Paper;

public class IntComparatorAsc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getHeight(), o2.getHeight());
	}

}
