public class Cellphone{
	String customerName;
	static String brandName;
	int ramInGB;
	int memoryInGB;
	float displaySize;
	static String color;
	int amount;
	float ratings;
	static String platform;
	int manufYear;
	
	static {
		brandName = "Realme";
		color = "Black";
		platform = "Flipkart";
	}
	
	Cellphone(String customerName,int ramInGB,int memoryInGB,float displaySize,int amount,float ratings,int manufYear){
		this.customerName = customerName;
		this.ramInGB = ramInGB;
		this.memoryInGB  = memoryInGB;
		this.displaySize = displaySize;
		this.amount = amount;
		this.ratings = ratings;
		this.manufYear = manufYear;
	}
	public static void main(String [] args){
		
		Cellphone cp = new Cellphone("Varun",8,128,6.1f,25000,4.5f,2020);
		Cellphone cp1 = new Cellphone("Harsha",12,128,6.0f,24000,4.0f,2019);
		Cellphone cp2 = new Cellphone("Amit",6,60,5.7f,18000,3.5f,2021);
		
		if(cp!=null && cp1!=null && cp2!=null){
			System.out.println("Customer Name:"+cp.customerName);
			System.out.println("Brand Name:"+cp.brandName);
			System.out.println("RAM in GB:"+cp.ramInGB);
			System.out.println("Memory in GB:"+cp.memoryInGB);
			System.out.println("Display Size:"+cp.displaySize);
			System.out.println("Color:"+cp.color);
			System.out.println("Amount:"+cp.amount);
			System.out.println("Ratings:"+cp.ratings);
			System.out.println("Platform:"+cp.platform);
			System.out.println("Manufactured year:"+cp.manufYear);
			
			System.out.println("---------------------------------------------------");
			
			System.out.println("Customer Name:"+cp1.customerName);
			System.out.println("Brand Name:"+cp1.brandName);
			System.out.println("RAM in GB:"+cp1.ramInGB);
			System.out.println("Memory in GB:"+cp1.memoryInGB);
			System.out.println("Display Size:"+cp1.displaySize);
			System.out.println("Color:"+cp1.color);
			System.out.println("Amount:"+cp1.amount);
			System.out.println("Ratings:"+cp1.ratings);
			System.out.println("Platform:"+cp1.platform);
			System.out.println("Manufactured year:"+cp1.manufYear);
			
			System.out.println("---------------------------------------------------");
			
			System.out.println("Customer Name:"+cp2.customerName);
			System.out.println("Brand Name:"+cp2.brandName);
			System.out.println("RAM in GB:"+cp2.ramInGB);
			System.out.println("Memory in GB:"+cp2.memoryInGB);
			System.out.println("Display Size:"+cp2.displaySize);
			System.out.println("Color:"+cp2.color);
			System.out.println("Amount:"+cp2.amount);
			System.out.println("Ratings:"+cp2.ratings);
			System.out.println("Platform:"+cp2.platform);
			System.out.println("Manufactured year:"+cp2.manufYear);
		}
	}
}
	
	