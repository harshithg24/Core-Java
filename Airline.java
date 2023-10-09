public class Airline{
	String firstName;
	String lastName;
	static String gender;
	int age;
	static String nationality;
	static String airportName;
	String destination;
	String journeyDate;
	String deptTiming;
	String arriTiming;
	
	static{
		gender = "Male";
		nationality = "Indian";
		airportName = "kempegowda International Airport";
	}
	
	Airline(String firstName,String lastName,int age,String destination,String journeyDate,String deptTiming,String arriTiming){
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.destination = destination;
         this.journeyDate = journeyDate;
         this.deptTiming = deptTiming;
         this.arriTiming = arriTiming;
	}		 
	
	public static void main(String [] args){
		
		Airline ar = new Airline("Manoj","T J",23,"Dubai","12/10/2023","23:20","06:34");
		Airline ar1 = new Airline("Ashish","Shetty",22,"Mumbai","22/10/2023","20:20","09:34");
		Airline ar2 = new Airline("Arjun","V",21,"Qatar","11/10/2023","11:20","15:34");
		
		if(ar!=null && ar1!=null && ar2!=null){
			System.out.println("First Name:"+ar.firstName);
			System.out.println("Last Name:"+ar.lastName);
			System.out.println("Gender"+ar.gender);
			System.out.println("Age:"+ar.age);
			System.out.println("Nationality:"+ar.nationality);
			System.out.println("Airport Name:"+ar.airportName);
			System.out.println("Destination:"+ar.destination);
			System.out.println("Journey Date:"+ar.journeyDate);
            System.out.println("Departure Timing:"+ar.deptTiming);
            System.out.println("Arrival Timing:"+ar.arriTiming);
			
			System.out.println("-------------------------------------------------");
			
			System.out.println("First Name:"+ar1.firstName);
			System.out.println("Last Name:"+ar1.lastName);
			System.out.println("Gender"+ar1.gender);
			System.out.println("Age:"+ar1.age);
			System.out.println("Nationality:"+ar1.nationality);
			System.out.println("Airport Name:"+ar1.airportName);
			System.out.println("Destination:"+ar1.destination);
			System.out.println("Journey Date:"+ar1.journeyDate);
            System.out.println("Departure Timing:"+ar1.deptTiming);
            System.out.println("Arrival Timing:"+ar1.arriTiming);
			
			System.out.println("-------------------------------------------------");
			
			System.out.println("First Name:"+ar2.firstName);
			System.out.println("Last Name:"+ar2.lastName);
			System.out.println("Gender"+ar2.gender);
			System.out.println("Age:"+ar2.age);
			System.out.println("Nationality:"+ar2.nationality);
			System.out.println("Airport Name:"+ar2.airportName);
			System.out.println("Destination:"+ar2.destination);
			System.out.println("Journey Date:"+ar2.journeyDate);
            System.out.println("Departure Timing:"+ar2.deptTiming);
            System.out.println("Arrival Timing:"+ar2.arriTiming);
			
		}
	}
}
			
			
			
		
		
		
		
	
	
	
    	