public class Biketrade {
	String bikeName;
	int yearSold;
    String ownerName;
    int presentPrice;
    int sellingPrice;
    int kmsDriven;
    String fuelType;
    String sellerType;
    String transmissionSpeed;
    int weight;	
	
	Biketrade(String bikeName,int yearSold,String ownerName,int presentPrice,int sellingPrice,int kmsDriven,String fuelType,String sellerType,String transmissionSpeed,int weight){
	this.bikeName=bikeName;
	this.yearSold=yearSold;
    this.ownerName=ownerName;
    this.presentPrice=presentPrice;
    this.sellingPrice=sellingPrice;
    this.kmsDriven=kmsDriven;
    this.fuelType=fuelType;
    this.sellerType=sellerType;
    this.transmissionSpeed=transmissionSpeed;
    this.weight=weight;	
	}
	
	public static void main(String[] args){
		
		Biketrade bt =new Biketrade("Pulsar200NS",2015,"Manoj",235000,90000,35000,"Petrol","Individual","200cc",150);
		
		if(bt!=null){
		System.out.println("Bike Name:" + bt.bikeName);
		System.out.println("Sold at the year:" + bt.yearSold);
		System.out.println("Bike owner name:" + bt.ownerName);
		System.out.println("Present price:" + bt.presentPrice);
		System.out.println("Selling Price:" + bt.sellingPrice);
		System.out.println("Kms driven:" + bt.kmsDriven);
		System.out.println("Fuel type:" + bt.fuelType);
		System.out.println("Seller type:" + bt.sellerType);
		System.out.println("transmissionSpeed:" + bt.transmissionSpeed);
		System.out.println("weight:" + bt.weight);
		}
		
		System.out.println("----------------------------------------------------------------");
		
		Biketrade bt1 =new Biketrade("Xpulse2004v",2022,"Akshay",210000,190000,30000,"Petrol","Individual","200cc",204);
		
		if(bt1!=null){
		System.out.println("Bike Name:" + bt1.bikeName);
		System.out.println("Sold at the year:" + bt1.yearSold);
		System.out.println("Bike owner name:" + bt1.ownerName);
		System.out.println("Present price:" + bt1.presentPrice);
		System.out.println("Selling Price:" + bt1.sellingPrice);
		System.out.println("Kms driven:" + bt1.kmsDriven);
		System.out.println("Fuel type:" + bt1.fuelType);
		System.out.println("Seller type:" + bt1.sellerType);
		System.out.println("transmissionSpeed:" + bt1.transmissionSpeed);
		System.out.println("weight:" + bt1.weight);
		}
		
		System.out.println("----------------------------------------------------------------");
		
		Biketrade bt2 =new Biketrade("Apacherr310",2018,"Surya",350000,320000,10000,"Petrol","Individual","310cc",304);
		
		
		if(bt2!=null){
		System.out.println("Bike Name:" + bt2.bikeName);
		System.out.println("Sold at the year:" + bt2.yearSold);
		System.out.println("Bike owner name:" + bt2.ownerName);
		System.out.println("Present price:" + bt2.presentPrice);
		System.out.println("Selling Price:" + bt2.sellingPrice);
		System.out.println("Kms driven:" + bt2.kmsDriven);
		System.out.println("Fuel type:" + bt2.fuelType);
		System.out.println("Seller type:" + bt2.sellerType);
		System.out.println("transmissionSpeed:" + bt2.transmissionSpeed);
		System.out.println("weight:" + bt2.weight);
		}
		
	}
}