public class Cartrade {
	String carName;
	int yearSold;
    String ownerName;
    int presentPrice;
    int sellingPrice;
    int kmsDriven;
    String fuelType;
    String sellerType;
    String transmission;
    int weight;	
	
	Cartrade(String carName,int yearSold,String ownerName,int presentPrice,int sellingPrice,int kmsDriven,String fuelType,String sellerType,String transmission,int weight){
	this.carName=carName;
	this.yearSold=yearSold;
    this.ownerName=ownerName;
    this.presentPrice=presentPrice;
    this.sellingPrice=sellingPrice;
    this.kmsDriven=kmsDriven;
    this.fuelType=fuelType;
    this.sellerType=sellerType;
    this.transmission=transmission;
    this.weight=weight;	
	}
	
	public static void main(String[] args){
		
		Cartrade ct =new Cartrade("Ritz",2015,"Ram",235000,200000,35000,"Petrol","Individual","Manual",3504);
		System.out.println("Car Name:" + ct.carName);
		System.out.println("Sold at the year:" + ct.yearSold);
		System.out.println("Car owner name:" + ct.ownerName);
		System.out.println("Present price:" + ct.presentPrice);
		System.out.println("Selling Price:" + ct.sellingPrice);
		System.out.println("Kms driven:" + ct.kmsDriven);
		System.out.println("Fuel type:" + ct.fuelType);
		System.out.println("Seller type:" + ct.sellerType);
		System.out.println("Transmission:" + ct.transmission);
		System.out.println("weight:" + ct.weight);
		
		System.out.println("----------------------------------------------------------------");
		
		Cartrade ct1 =new Cartrade("Wagonr",2011,"Shekar",250000,200000,30000,"Diesel","Individual","Manual",4504);
		System.out.println("Car Name:" + ct1.carName);
		System.out.println("Sold at the year:" + ct1.yearSold);
		System.out.println("Car owner name:" + ct1.ownerName);
		System.out.println("Present price:" + ct1.presentPrice);
		System.out.println("Selling Price:" + ct1.sellingPrice);
		System.out.println("Kms driven:" + ct1.kmsDriven);
		System.out.println("Fuel type:" + ct1.fuelType);
		System.out.println("Seller type:" + ct1.sellerType);
		System.out.println("Transmission:" + ct1.transmission);
		System.out.println("weight:" + ct1.weight);
		
		System.out.println("----------------------------------------------------------------");
		
		Cartrade ct2 =new Cartrade("Nano",2010,"Prasad",150000,120000,20000,"Petrol","Individual","Manual",2504);
		System.out.println("Car Name:" + ct2.carName);
		System.out.println("Sold at the year:" + ct2.yearSold);
		System.out.println("Car owner name:" + ct2.ownerName);
		System.out.println("Present price:" + ct2.presentPrice);
		System.out.println("Selling Price:" + ct2.sellingPrice);
		System.out.println("Kms driven:" + ct2.kmsDriven);
		System.out.println("Fuel type:" + ct2.fuelType);
		System.out.println("Seller type:" + ct2.sellerType);
		System.out.println("Transmission:" + ct2.transmission);
		System.out.println("weight:" + ct2.weight);
		
	}
}