public class Employee{
	int age;
	int joiningYear;
	int experience;
	
	Employee(int age,int joiningYear,int experience){
		this(age,joiningYear);
		this.experience = experience;
	}
	
	Employee(int age,int joiningYear){
		this(age);
		this.joiningYear = joiningYear;
	}
	
	Employee(int age){
		this.age = age;
	}
	
	public static void main(String[] args){
		 Employee em = new Employee(24,2020);
		 Employee em1 = new Employee(23);
		 
		 if(em!=null && em1!=null){
			 
			 System.out.println("Age of the Employee:"+em.age);
			 System.out.println("Joining year of the Employee:"+em.joiningYear);
			 System.out.println("EXperience of the Employee:"+em.experience);
			 
			 System.out.println("----------------------------------------------------------");
			 
			 System.out.println("Age of the Employee:"+em1.age);
			 System.out.println("Joining year of the Employee:"+em1.joiningYear);
			 System.out.println("EXperience of the Employee:"+em1.experience);
		 }
	}
}
			 
			 