package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class CollectionRunner {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<>();
		collection.add("Mirchi FM");        
		collection.add("93.5 FM");
		collection.add("Deccan Radio");
		collection.add("Entertainment Radioz");
		collection.add("Cricket Podcast");
		collection.add("Crime raio");
		collection.add("Local RAdio");
		collection.add("Placement radioz");
		collection.add("Xworkz radio");
		collection.add("Bharath Radio");
		
		Iterator<String> itr = collection.iterator();
		while(itr.hasNext()) {
			String ref = itr.next();
			System.out.println("element:"+ref);
			if(ref.endsWith("z")) {
				System.out.println("Element ends with z:"+ref);
			}
			else {
				System.out.println("Element does not end with z:"+ref);
			}
		}
		
		System.out.println("-------------------------------------------------");
		
		
		Collection<String> hospital = new ArrayList<>();
		hospital.add("Hospital1o");
        hospital.add("Hospital2");
        hospital.add("Hospital3O");
        hospital.add("Hospital4");
        hospital.add("Hospital5O");
        hospital.add("Hospital6");
        hospital.add("Hospital7O");
        hospital.add("Hospital8o");
        hospital.add("Hospital9");
        hospital.add("Hospital10O");
        
        Iterator<String> itr1 = hospital.iterator();
        while(itr1.hasNext()) {
        	String hos = itr1.next();                                //hos.charAt(hos.length()-1)=='o'
        	if(hos.endsWith("O")) {
        		System.out.println("Elements ending with O:"+hos);
        	}
        	else if(hos.endsWith("o")) {
        		System.out.println("Elements ending with o:"+hos);
        	}
        	else {
        		System.out.println("Elements which are not ending with O or o:"+hos);
        	}
        	
        }
        
        System.out.println("-----------------------------------------------------------");
        
        Collection<String> statue = new ArrayList<>();
        statue.add("Alexander");
        statue.add("EleanoR");
        statue.add("Christopher");
        statue.add("Hector");
        statue.add("VictoR");
        statue.add("Amber");
        statue.add("Taylor");
        statue.add("OscaR");
        statue.add("Walter");
        statue.add("Arthur");
        
        Iterator<String> stat = statue.iterator();
        while(stat.hasNext()) {
        	String st = stat.next();
        	if(st.toLowerCase().endsWith("r")) {  
        		System.out.println("Elements ending with r:"+st);        //st.toLowerCase().toUpperCase().endsWith("r")
        		//st.charAt(st.length()-1)=='r' || st.charAt(st.length()-1)=='R'
        	}
        }
        
        System.out.println("-----------------------------------------------------");
        
        Collection<String> park = new ArrayList<>();
        park.add("Benk");
        park.add("Blink");
        park.add("Boonk");
        park.add("pinnnk");
        park.add("Banennk");
        park.add("Lqeenk");
        park.add("Bunik");
        park.add("lank");
        park.add("ournk");
        park.add("Wenk");
        park.add("Benkinh");
        park.add("Benky");
        park.add("Benkpl");
        park.add("Benk");
        park.add("linnk");
        park.add("Bekinnk");
        park.add("llenk");
       
        Iterator<String> pk = park.iterator();
        while(pk.hasNext()){
        	String par = pk.next();
      
        	if(par.toLowerCase().startsWith("b") &&
        			par.toLowerCase().endsWith("k")) {
        		System.out.println("Elements starting with b and ending with k:"+par);
        	}
        }
        
        System.out.println("------------------------------------------------------------------");
        
        Collection<String> human_parts = new ArrayList<>();
        human_parts.add("Head");
        human_parts.add("Neck");
        human_parts.add("Shoulder");
        human_parts.add("Arm");
        human_parts.add("Elbow");
        human_parts.add("Forearm");
        human_parts.add("Wrist");
        human_parts.add("Hand");
        human_parts.add("Finger");
        human_parts.add("Chest");
        human_parts.add("Abdomen");
        human_parts.add("Back");
        human_parts.add("Hip");
        human_parts.add("Thigh");
        human_parts.add("Knee");
        human_parts.add("Leg");
        human_parts.add("Ankle");
        human_parts.add("Foot");
        human_parts.add("Toe");
        
        Iterator<String> human = human_parts.iterator();
        while(human.hasNext()) {
        	String parts = human.next();
        	if(parts.length()<5) {
        		System.out.println("Human Parts less than 5 characters:"+parts);
        	}
        }
        
        System.out.println("---------------------------------------------------------");
        
        Collection<String> airport = new ArrayList<>();
        airport.add("John F. Kennedy International Airport");
        airport.add("Los Angeles International Airport");
        airport.add("Heathrow Airport");
        airport.add("Tokyo Haneda Airport");
        airport.add("O'Hare International Airport");
        airport.add("Beijing Capital International Airport");
        airport.add("Dubai International Airport");
        airport.add("Denver International Airport");
        airport.add("Singapore Changi Airport");
        airport.add("Sydney Kingsford Smith Airport");
        airport.add("Frankfurt Airport");
        airport.add("Incheon International Airport");
        airport.add("Amsterdam Airport Schiphol");
        airport.add("Hartsfield-Jackson Atlanta International Airport");
        airport.add("Hong Kong International Airport");
        airport.add("San Francisco International Airport");
        airport.add("Dallas/Fort Worth International Airport");
        airport.add("Denver International Airport");
        airport.add("Seattle-Tacoma International Airport");
        airport.add("Dublin Airport");
        
        Iterator<String> air = airport.iterator();
        while(air.hasNext()) {
        	String port = air.next();
        	
        	String upper = port.toUpperCase();
        	System.out.println("Airport names in uppercase:"+upper);
        }

	
	
	}     

}
