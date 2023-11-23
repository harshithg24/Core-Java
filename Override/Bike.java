public class Bike extends Vehicle{
	
	int accomodate;
	boolean license;
	
	Bike(int accomodate,boolean license){
		
		super("Bajaj","Pulsar NS200",2015,"white","Petrol",200,true,0,2,true);
		this.accomodate = accomodate;
		this.license = license;
	}
	
	@Override
	void startEngine(){
		System.out.println("Running start engine method of Bike");
	}
	
	@Override
	void stopEngine(){
		System.out.println("Running stop engine method of Bike");
	}
	
	@Override
	void headLight(){
		System.out.println("Running head light method of Bike");
	}
	
	@Override
	void accelerate(){
		System.out.println("Running accelerate method of Bike");
	}
	
	@Override
	void brake(){
		System.out.println("Running brake method of Bike");
	}
	
	void kmsDriven(){
		System.out.println("Running kms driven method of bike");
	}
	
	void alignment(){
		System.out.println("Running alignment method of bike");
	}
	
	void insurance(){
		System.out.println("Running insurance method of bike");
	}
	
	void Condition(){
		System.out.println("Running condition method of bike");
	}
}