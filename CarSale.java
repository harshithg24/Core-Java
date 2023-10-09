public class CarSale {
	String carName;
	static String brandName;
    String ownerName;
    int presentPrice;
    int sellingPrice;
    int kmsDriven;
    static String fuelType;
    static int wheels;
    String transmission;
    int weight;	
	
	static{
		brandName = "Hyundai";
		fuelType = "Petrol";
		wheels = 4;
	}
	CarSale(String carName,String ownerName,int presentPrice,int sellingPrice,int kmsDriven,String transmission,int weight){
	this.carName=carName;
    this.ownerName=ownerName;
    this.presentPrice=presentPrice;
    this.sellingPrice=sellingPrice;
    this.kmsDriven=kmsDriven;
    this.transmission=transmission;
    this.weight=weight;	
	}
	
	public static void main(String[] args){
		
		CarSale ct =new CarSale("Verna","Ram",235000,200000,35000,"Manual",3504);
		CarSale ct1 =new CarSale("Creta","Shekar",250000,200000,30000,"Manual",4504);
		CarSale ct2 =new CarSale("Venue","Prasad",150000,120000,20000,"Manual",2504);
		
		if(ct!=null && ct1!=null && ct2!=null){
		System.out.println("Car Name:" + ct.carName);
		System.out.println("Brand name:" + ct.brandName);
		System.out.println("Car owner name:" + ct.ownerName);
		System.out.println("Present price:" + ct.presentPrice);
		System.out.println("Selling Price:" + ct.sellingPrice);
		System.out.println("Kms driven:" + ct.kmsDriven);
		System.out.println("Fuel type:" + ct.fuelType);
		System.out.println("Wheels:" + ct.wheels);
		System.out.println("Transmission:" + ct.transmission);
		System.out.println("weight:" + ct.weight);
		
		System.out.println("----------------------------------------------------------------");
		
		
		System.out.println("Car Name:" + ct1.carName);
		System.out.println("Brandname:" + ct1.brandName);
		System.out.println("Car owner name:" + ct1.ownerName);
		System.out.println("Present price:" + ct1.presentPrice);
		System.out.println("Selling Price:" + ct1.sellingPrice);
		System.out.println("Kms driven:" + ct1.kmsDriven);
		System.out.println("Fuel type:" + ct1.fuelType);
		System.out.println("Wheels:" + ct1.wheels);
		System.out.println("Transmission:" + ct1.transmission);
		System.out.println("weight:" + ct1.weight);
		
		
		System.out.println("----------------------------------------------------------------");
		
		
		System.out.println("Car Name:" + ct2.carName);
		System.out.println("Brand name:" + ct2.brandName);
		System.out.println("Car owner name:" + ct2.ownerName);
		System.out.println("Present price:" + ct2.presentPrice);
		System.out.println("Selling Price:" + ct2.sellingPrice);
		System.out.println("Kms driven:" + ct2.kmsDriven);
		System.out.println("Fuel type:" + ct2.fuelType);
		System.out.println("Wheels:" + ct2.wheels);
		System.out.println("Transmission:" + ct2.transmission);
		System.out.println("weight:" + ct2.weight);
		}
	}
}