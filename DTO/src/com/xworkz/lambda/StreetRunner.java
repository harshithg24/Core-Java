package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreetRunner {
	
	public static void main(String[] args) {
		
		StreetDTO StreetDto=new StreetDTO(111, "banglore", "mg road", 300);
		StreetDTO StreetDTO1=new StreetDTO(121, "davangere", "pb road", 200);
		StreetDTO StreetDTO2=new StreetDTO(311, "hubli", "hubli road", 1000);
		StreetDTO StreetDTO3=new StreetDTO(211, "shimoga", "bypass road", 400);
		StreetDTO StreetDTO4=new StreetDTO(11, "mysore", "mysore road", 3500);
		
		List<StreetDTO> list = new ArrayList<StreetDTO>();
		list.add(StreetDto);
		list.add(StreetDTO1);
		list.add(StreetDTO2);
		list.add(StreetDTO3);
		list.add(StreetDTO4);
		
		Collections.sort(list,(o1,o2)->Integer.compare(o1.getStreetNo(),o2.getStreetNo()));
		for(StreetDTO ref:list) {
			System.out.println(ref);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		Collections.sort(list,(o1,o2)->Integer.compare(o2.getStreetNo(),o1.getStreetNo()));
		for(StreetDTO ref:list) {
			System.out.println(ref);
		}
		
	}

}
