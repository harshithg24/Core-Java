public class CompanyEmployee {
	String employeeName;
	static String qualification;
	String designation;
	static String gender;
	String collegeName;
	String schoolName;
	String location;
	String maritalStatus;
	String ownVehicle;
	static String company;
	
	static{
		qualification = "B.E";
		gender = "Male";
		company = "Cisco";
	}
	
	CompanyEmployee(String employeeName,String designation,String collegeName,String schoolName,String location,String maritalStatus,String ownVehicle){
		this.employeeName = employeeName;
		this.designation = designation;
		this.collegeName = collegeName;
		this.schoolName = schoolName;
		this.location = location;
		this.maritalStatus = maritalStatus;
		this.ownVehicle = ownVehicle;
	}
	
	public static void main(String [] args){
		
		CompanyEmployee ce = new CompanyEmployee("Harish Kumar","Tester","Dayananda Sagar College","Janan Jyothi School","Bengaluru","Yes","Yes");
		CompanyEmployee ce1 = new CompanyEmployee("Kishore Kumar","Tester","PESIT College","Seshadripuram High School","Mumbai","No","Yes");
		CompanyEmployee ce2 = new CompanyEmployee("Vinayak Gowda","Tester","RV College","Poorna Prajna School","Mysuru","No","Yes");
		
		
		if(ce!=null && ce1!=null && ce2!=null){
			System.out.println("Employee Name:"+ce.employeeName);
			System.out.println("Qualification:"+ce.qualification);
			System.out.println("Gender:"+ce.gender);
			System.out.println("Company:"+ce.company);
            System.out.println("Designation:"+ce.designation);
            System.out.println("College name:"+ce.collegeName);
            System.out.println("School name:"+ce.schoolName);
            System.out.println("Loaction:"+ce.location);
            System.out.println("Marital Status:"+ce.maritalStatus);
            System.out.println("Own Vehicle:"+ce.ownVehicle);
			
			System.out.println("------------------------------------------");
			
			System.out.println("Employee Name:"+ce1.employeeName);
			System.out.println("Qualification:"+ce1.qualification);
			System.out.println("Gender:"+ce1.gender);
			System.out.println("Company:"+ce1.company);
            System.out.println("Designation:"+ce1.designation);
            System.out.println("College name:"+ce1.collegeName);
            System.out.println("School name:"+ce1.schoolName);
            System.out.println("Loaction:"+ce1.location);
            System.out.println("Marital Status:"+ce1.maritalStatus);
            System.out.println("Own Vehicle:"+ce1.ownVehicle);
			
			System.out.println("------------------------------------------");
			
			System.out.println("Employee Name:"+ce2.employeeName);
			System.out.println("Qualification:"+ce2.qualification);
			System.out.println("Gender:"+ce2.gender);
			System.out.println("Company:"+ce2.company);
            System.out.println("Designation:"+ce2.designation);
            System.out.println("College name:"+ce2.collegeName);
            System.out.println("School name:"+ce2.schoolName);
            System.out.println("Loaction:"+ce2.location);
            System.out.println("Marital Status:"+ce2.maritalStatus);
            System.out.println("Own Vehicle:"+ce2.ownVehicle);
			
		}
	}
}	