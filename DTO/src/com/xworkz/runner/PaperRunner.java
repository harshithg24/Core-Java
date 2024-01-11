package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.dto.Paper;

 import com.xworkz.comparator.AscComparator;
 import com.xworkz.comparator.DesComparator;
 import com.xworkz.comparator.FloatComparatorAsc;
 import com.xworkz.comparator.FloatComparatorDes;
 import com.xworkz.comparator.IntComparatorAsc;
 import com.xworkz.comparator.IntComparatorDes;



public class PaperRunner {

	public static void main(String[] args) {
		
		
		Paper paper  = new Paper("NoteBook", 5, 0.5f, true);
		Paper paper1 = new Paper("A4", 5, 0.3f, true);
		Paper paper2 = new Paper("Cardboard", 10, 0.5f, true);
		Paper paper3 = new Paper("Drawing Sheet", 15, 0.9f, true);
		Paper paper4 = new Paper("Boster", 7, 0.5f, true);

		List<Paper> list = new ArrayList<>();
		
		list.add(paper);
		list.add(paper1);
		list.add(paper2);
		list.add(paper3);
		list.add(paper4);
		
//		
//		for(Paper data:list) {
//			System.out.println(data);
//		}
		
		Comparator<Paper> comp = new AscComparator();
		Collections.sort(list,comp);
		
		System.out.println("Ascending");
		for(Paper val:list) {
			
			System.out.println(val);
		}
		
		System.out.println("--------------------------------");
		
		Comparator<Paper> comp1 = new DesComparator();
		Collections.sort(list,comp1);
		
		System.out.println("Descending");
		for(Paper val:list) {
			
			System.out.println(val);
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		
		Comparator<Paper> compH = new IntComparatorAsc();
		Collections.sort(list,compH);
		
		System.out.println("Ascending");
		for(Paper val:list) {
			
			System.out.println(val);
		}
		
		System.out.println("--------------------------------");
		
		Comparator<Paper> compH1 = new IntComparatorDes();
		Collections.sort(list,compH1);
		
		System.out.println("Descending");
		for(Paper val:list) {
			
			System.out.println(val);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		Comparator<Paper> compT = new FloatComparatorAsc();
		Collections.sort(list,compT);
		
		System.out.println("Ascending");
		for(Paper val:list) {
			
			System.out.println(val);
		}
		
		System.out.println("--------------------------------");
		
		Comparator<Paper> compT1 = new FloatComparatorDes();
		Collections.sort(list,compT1);
		
		System.out.println("Descending");
		for(Paper val:list) {
			
			System.out.println(val);
		}
		
		
		
		
	}

}