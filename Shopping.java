public class Shopping{
	String customerName;
	static String shopName;
	String gender;
	String category;
	static String location;
	String color;
    String clothType;
    static String season;
    String size;
    int amount;	
	
	static {
		shopName = "Reliance Trends";
		location = "Gopalan Mall";
		season = "Winter";
	}
	
	Shopping(String customerName,String gender,String category,String color,String clothType,String size,int amount){
		this.customerName = customerName;
		this.gender = gender;
		this.category = category;
		this.color = color;
		this.clothType = clothType;
		this.size = size;
		this.amount = amount;
	}
	 
	 public static void main(String [] args){
		 Shopping sh = new Shopping("Rajesh","Male","Formal","Black","Shirt","L",5000);
		 Shopping sh1 = new Shopping("Srusthi","Female","Formal","Grey","Pant","L",4000);
		 Shopping sh2 = new Shopping("Amir","Male","Formal","White","Shirt","L",6000);
		 
		 if(sh!=null && sh1!=null && sh2!=null){
		 System.out.println("Customer Name:"+sh.customerName);
		 System.out.println("Shop name:"+sh.shopName);
		 System.out.println("Gender:"+sh.gender);
		 System.out.println("Category:"+sh.category);
		 System.out.println("Location:"+sh.location);
		 System.out.println("Color:"+sh.color);
		 System.out.println("Cloth-type:"+sh.clothType);
		 System.out.println("Season:"+sh.season);
		 System.out.println("Size:"+sh.size);
		 System.out.println("Amount:"+sh.amount);
		 
		 System.out.println("----------------------------------------------------");
		 
		 System.out.println("Customer Name:"+sh1.customerName);
		 System.out.println("Shop name:"+sh1.shopName);
		 System.out.println("Gender:"+sh1.gender);
		 System.out.println("Category:"+sh1.category);
		 System.out.println("Location:"+sh1.location);
		 System.out.println("Color:"+sh1.color);
		 System.out.println("Cloth-type:"+sh1.clothType);
		 System.out.println("Season:"+sh1.season);
		 System.out.println("Size:"+sh1.size);
		 System.out.println("Amount:"+sh1.amount);
		 
		  System.out.println("----------------------------------------------------");
		 
		 System.out.println("Customer Name:"+sh2.customerName);
		 System.out.println("Shop name:"+sh2.shopName);
		 System.out.println("Gender:"+sh2.gender);
		 System.out.println("Category:"+sh2.category);
		 System.out.println("Location:"+sh2.location);
		 System.out.println("Color:"+sh2.color);
		 System.out.println("Cloth-type:"+sh2.clothType);
		 System.out.println("Season:"+sh2.season);
		 System.out.println("Size:"+sh2.size);
		 System.out.println("Amount:"+sh2.amount);
		 
		 }
	 }
}
		 
		 