public class Job {
	String firstName;
	String gender;
    String qualification;
    int experience;
    String college;
    int gradYear;
    String location;
    String company;
    String workType;
    int salary;	
	
	Job(String firstName,String gender,String qualification,int experience,String college,int gradYear,String location,String company,String workType,int salary){
	this.firstName=firstName;
	this.gender=gender;
    this.qualification=qualification;
    this.experience=experience;
    this.college=college;
    this.gradYear=gradYear;
    this.location=location;
    this.company=company;
    this.workType=workType;
    this.salary=salary;	
	}
	
	public static void main(String[] args){
		
		Job jb =new Job("Kishore","Male","BCA",5,"Narayana College",2019,"Chennai","Wipro","Full-time",45000);
		System.out.println("First Name:" + jb.firstName);
		System.out.println("Gender:" + jb.gender);
		System.out.println("Qualification:" + jb.qualification);
		System.out.println("Experience:" + jb.experience);
		System.out.println("College:" + jb.college);
		System.out.println("Graduated Year:" + jb.gradYear);
		System.out.println("Location:" + jb.location);
		System.out.println("Company:" + jb.company);
		System.out.println("Work-type:" + jb.workType);
		System.out.println("Salary:" + jb.salary);
		
		System.out.println("----------------------------------------------------------------");
		
		Job jb1 =new Job("Akash","Male","B.Tech",3,"JNN College",2020,"Mumbai","TCS","Full-time",35000);
		System.out.println("First Name:" + jb1.firstName);
		System.out.println("Gender:" + jb1.gender);
		System.out.println("Qualification:" + jb1.qualification);
		System.out.println("Experience:" + jb1.experience);
		System.out.println("College:" + jb1.college);
		System.out.println("Graduated Year:" + jb1.gradYear);
		System.out.println("Location:" + jb1.location);
		System.out.println("Company:" + jb1.company);
		System.out.println("Work-type:" + jb1.workType);
		System.out.println("Salary:" + jb1.salary);
		
		System.out.println("----------------------------------------------------------------");
		
		Job jb2 =new Job("Sahana","Female","B.Com",2,"PESIT College",2021,"Bengaluru","Infosys","Full-time",25000);
		System.out.println("First Name:" + jb2.firstName);
		System.out.println("Gender:" + jb2.gender);
		System.out.println("Qualification:" + jb2.qualification);
		System.out.println("Experience:" + jb2.experience);
		System.out.println("College:" + jb2.college);
		System.out.println("Graduated Year:" + jb2.gradYear);
		System.out.println("Location:" + jb2.location);
		System.out.println("Company:" + jb2.company);
		System.out.println("Work-type:" + jb2.workType);
		System.out.println("Salary:" + jb2.salary);
		
	}
}