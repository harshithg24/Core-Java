public class Vehicle{
	String brand;
    String model;
    int year;
    String color;
    String fuelType;
    double currentSpeed;
    boolean isEngineRunning;
    int numDoors;
    int numWheels;
    boolean isConvertible;
	
	Vehicle(String brand,String model,int year,String color,String fuelType,double currentSpeed,boolean isEngineRunning,int numDoors,int numWheels,boolean isConvertible){
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.fuelType = fuelType;
		this.currentSpeed = currentSpeed;
		this.isEngineRunning = isEngineRunning;
		this.numDoors = numDoors;
		this.numWheels = numWheels;
		this.isConvertible = isConvertible;
	}
	
	void startEngine(){
		System.out.println("Running start engine method of vehicle");
	}
	
	void stopEngine(){
		System.out.println("Running stop engine method of vehicle");
	}
	
	void headLight(){
		System.out.println("Running head light method of vehicle");
	}
	
	void accelerate(){
		System.out.println("Running accelerate method of vehicle");
	}
	
	void brake(){
		System.out.println("Running brake method of vehicle");
	}
	
	void service(){
		System.out.println("Running service method of vehicle");
	}
	
	void emissionTest(){
		System.out.println("Running emission test method of vehicle");
	}
	
	void durability(){
		System.out.println("Running durability method of vehicle");
	}
	
	void registration(){
		System.out.println("Running registration method of vehicle");
	}
	
	void speedometer(){
		System.out.println("Running speedometer method of vehicle");
	}
	
	void maxSpeed(){
		System.out.println("Running maximum speed method of vehicle");
	}
}
	
