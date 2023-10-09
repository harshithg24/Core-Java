public class Medicine{
	String patientName;
	String hospital;
	String doctorName;
	static String tablet;
	String symptom;
	static int price;
	String date;
	String storeName;
	String location;
	static int manufYear;
	
	static {
		tablet = "Dolo 650";
		price = 50;
		manufYear = 2020;
	}
	
	Medicine(String patientName,String hospital,String doctorName,String symptom,String date,String storeName,String location){
		this.patientName = patientName;
		this.hospital = hospital;
		this.doctorName = doctorName;
		this.symptom = symptom;
		this.date = date;
		this.storeName = storeName;
		this.location = location;
	}
	 public static void main(String[] args){
		 
		 Medicine md = new Medicine("Vikram","Nayana Hospital","Dr. Bhushan","headache","12/10/2023","Shiva medical","Bengaluru");
		 Medicine md1 = new Medicine("Arun","Nirmala Hospital","Dr. Ashok","High fever","05/10/2023","Mangala medical","Bengaluru");
		 Medicine md2 = new Medicine("Varun","KMC Hospital","Dr. Ashwath","Body pain","11/10/2023","Narayan medical","Bengaluru");
		 
		 if(md!=null && md1!=null && md2!=null){
			 System.out.println("Patient Name:"+md.patientName);
			 System.out.println("Hospital:"+md.hospital);
			 System.out.println("Doctor:"+md.doctorName);
			 System.out.println("Tablet:"+md.tablet);
			 System.out.println("Symptom:"+md.symptom);
			 System.out.println("Price:"+md.price);
			 System.out.println("Date:"+md.date);
			 System.out.println("Store Name:"+md.storeName);
			 System.out.println("Location:"+md.location);
			 System.out.println("Manufactured year:"+md.manufYear);
			 
			 System.out.println("--------------------------------------------------");
			 
			 System.out.println("Patient Name:"+md1.patientName);
			 System.out.println("Hospital:"+md1.hospital);
			 System.out.println("Doctor:"+md1.doctorName);
			 System.out.println("Tablet:"+md1.tablet);
			 System.out.println("Symptom:"+md1.symptom);
			 System.out.println("Price:"+md1.price);
			 System.out.println("Date:"+md1.date);
			 System.out.println("Store Name:"+md1.storeName);
			 System.out.println("Location:"+md1.location);
			 System.out.println("Manufactured year:"+md1.manufYear);
			 
			 System.out.println("--------------------------------------------------");
			 
			 System.out.println("Patient Name:"+md2.patientName);
			 System.out.println("Hospital:"+md2.hospital);
			 System.out.println("Doctor:"+md2.doctorName);
			 System.out.println("Tablet:"+md2.tablet);
			 System.out.println("Symptom:"+md2.symptom);
			 System.out.println("Price:"+md2.price);
			 System.out.println("Date:"+md2.date);
			 System.out.println("Store Name:"+md2.storeName);
			 System.out.println("Location:"+md2.location);
			 System.out.println("Manufactured year:"+md2.manufYear);
	
		 }
	 }
}	 
			 