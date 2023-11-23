public class VehicleRunner{
	
	public static void main(String... value){
		 
		 Vehicle vehicle = new Vehicle("Honda","Verna",2010,"White","Petrol",1000,true,4,4,true);
		 System.out.println("Brand:"+vehicle.brand);
		 System.out.println("Model:"+vehicle.model);
		 System.out.println("Year:"+vehicle.year);
		 System.out.println("Color:"+vehicle.color);
		 System.out.println("Fuel type:"+vehicle.fuelType);
		 System.out.println("Current speed"+vehicle.currentSpeed);
		 System.out.println("Engine Running"+vehicle.isEngineRunning);
		 System.out.println("Number of doors:"+vehicle.numDoors);
		 System.out.println("Number of wheels:"+vehicle.numWheels);
	     System.out.println("Is Convertible:"+vehicle.isConvertible);
		 vehicle.startEngine();
		 vehicle.stopEngine();
		 vehicle.headLight();
		 vehicle.accelerate();
		 vehicle.brake();
		 vehicle.service();
		 vehicle.emissionTest();
		 vehicle.durability();
		 vehicle.registration();
		 vehicle.speedometer();
		 vehicle.maxSpeed();
		 
		 System.out.println("------------------------------------------------------");
		 
		 Bike bike = new Bike(2,true);
		 
		 System.out.println("Brand:"+bike.brand);
		 System.out.println("Model:"+bike.model);
		 System.out.println("Year:"+bike.year);
		 System.out.println("Color:"+bike.color);
		 System.out.println("Fuel type:"+bike.fuelType);
		 System.out.println("Current speed"+bike.currentSpeed);
		 System.out.println("Engine Running"+bike.isEngineRunning);
		 System.out.println("Number of doors:"+bike.numDoors);
		 System.out.println("Number of wheels:"+bike.numWheels);
	     System.out.println("Is Convertible:"+bike.isConvertible);
		 System.out.println("Accomodation:"+bike.accomodate);
		 System.out.println("License:"+bike.license);
		 bike.startEngine();
		 bike.stopEngine();
		 bike.headLight();
		 bike.accelerate();
		 bike.kmsDriven();
		 bike.alignment();
		 bike.insurance();
		 bike.condition();
	}
}
		 
		 
		
