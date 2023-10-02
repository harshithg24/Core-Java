public class Travel {
	String name;
	String destination;
    String startDate;
    String endDate;
    int noOfDays;
    int age;
    String gender;
    String nationality;
    String accomodation;
    int amount;	
	
	Travel(String name,String destination,String startDate,String endDate,int noOfDays,int age,String gender,String nationality,String accomodation,int amount){
	this.name=name;
	this.destination=destination;
    this.startDate=startDate;
    this.endDate=endDate;
    this.noOfDays=noOfDays;
    this.age=age;
    this.gender=gender;
    this.nationality=nationality;
    this.accomodation=accomodation;
    this.amount=amount;	
	}
	
	public static void main(String[] args){
		
		Travel tl =new Travel("Disha","Goa","22/10/2023","24/10/2023",2,22,"Female","Indian","Resort",4500);
		System.out.println("First name:" + tl.name);
		System.out.println("Destination:" + tl.destination);
		System.out.println("Start Date:" + tl.startDate);
		System.out.println("End Date:" + tl.endDate);
		System.out.println("Number Of Days:" + tl.noOfDays);
		System.out.println("Age:" + tl.age);
		System.out.println("Gender:" + tl.gender);
		System.out.println("Nationality:" + tl.nationality);
		System.out.println("Accomodation:" + tl.accomodation);
		System.out.println("Amount:" + tl.amount);
		
		System.out.println("----------------------------------------------------------------");
		
		Travel tl1 =new Travel("Ashish","Wayanad","20/11/2023","23/11/2023",3,26,"Male","Indian","Hotel",6500);
		System.out.println("First name:" + tl1.name);
		System.out.println("Destination:" + tl1.destination);
		System.out.println("Start Date:" + tl1.startDate);
		System.out.println("End Date:" + tl1.endDate);
		System.out.println("Number Of Days:" + tl1.noOfDays);
		System.out.println("Age:" + tl1.age);
		System.out.println("Gender:" + tl1.gender);
		System.out.println("Nationality:" + tl1.nationality);
		System.out.println("Accomodation:" + tl1.accomodation);
		System.out.println("Amount:" + tl1.amount);
		
		System.out.println("----------------------------------------------------------------");
		
		Travel tl2 =new Travel("Ganesh","Pondicherry","05/10/2023","07/10/2023",2,22,"Male","Indian","Villa",5500);
		System.out.println("First name:" + tl2.name);
		System.out.println("Destination:" + tl2.destination);
		System.out.println("Start Date:" + tl2.startDate);
		System.out.println("End Date:" + tl2.endDate);
		System.out.println("Number Of Days:" + tl2.noOfDays);
		System.out.println("Age:" + tl2.age);
		System.out.println("Gender:" + tl2.gender);
		System.out.println("Nationality:" + tl2.nationality);
		System.out.println("Accomodation:" + tl2.accomodation);
		System.out.println("Amount:" + tl2.amount);
		
	}
}