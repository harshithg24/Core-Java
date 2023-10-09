public class Fitness{
	String name;
	String gender;
    int age;
	static String exercise;
	static String trainer;
    static String gymName;
    String joiningDate;
    int fees;
    int weight;
    String packageFees;
	
	static{
		exercise = "Cardio";
		trainer = "Akash";
		gymName = "Cult Fitness";
	}
	
	Fitness(String name,String gender,int age,String joiningDate,int fees,int weight,String packageFees){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.joiningDate = joiningDate;
		this.fees = fees;
		this.weight = weight;
		this.packageFees = packageFees;
	}
	
	public static void main(String [] args){
		
		Fitness fn = new Fitness("Darshan","Male",25,"1/9/2023",1500,68,"Monthly");
	    Fitness fn1 = new Fitness("Arun","Male",29,"1/8/2023",1500,68,"3 Months");
	    Fitness fn2 = new Fitness("Vignesh","Male",23,"11/9/2023",1500,68,"Year");
		
		if(fn!=null && fn1!=null && fn2!=null){
			System.out.println("Name:"+fn.name);
			System.out.println("Gender"+fn.gender);
            System.out.println("Age"+fn.age);
            System.out.println("Workout:"+fn.exercise);
            System.out.println("Trainer:"+fn.trainer);
            System.out.println("Gym name"+fn.gymName);
            System.out.println("Joining Date"+fn.joiningDate);
            System.out.println("Fees"+fn.fees);
            System.out.println("Weight"+fn.weight);
            System.out.println("Package Fees"+fn.packageFees);
 
            System.out.println("-----------------------------------------------------------"); 
			
			System.out.println("Name:"+fn1.name);
			System.out.println("Gender"+fn1.gender);
            System.out.println("Age"+fn1.age);
            System.out.println("Workout:"+fn1.exercise);
            System.out.println("Trainer:"+fn1.trainer);
            System.out.println("Gym name"+fn1.gymName);
            System.out.println("Joining Date"+fn1.joiningDate);
            System.out.println("Fees"+fn1.fees);
            System.out.println("Weight"+fn1.weight);
            System.out.println("Package Fees"+fn1.packageFees);
 
            System.out.println("-----------------------------------------------------------"); 
			
			System.out.println("Name:"+fn2.name);
			System.out.println("Gender"+fn2.gender);
            System.out.println("Age"+fn2.age);
            System.out.println("Workout:"+fn2.exercise);
            System.out.println("Trainer:"+fn2.trainer);
            System.out.println("Gym name"+fn2.gymName);
            System.out.println("Joining Date"+fn2.joiningDate);
            System.out.println("Fees"+fn2.fees);
            System.out.println("Weight"+fn2.weight);
            System.out.println("Package Fees"+fn2.packageFees);
 
		}
	}
}
	    