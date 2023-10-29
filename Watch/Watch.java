public class Watch{
	String brand;
	String model;
	String time;
	boolean alarmOption;
	WatchType type;
	
	Watch(String brand,String model,String time,boolean alarmOption,WatchType type){
		this.brand = brand;
		this.model = model;
		this.time = time;
		this.alarmOption = alarmOption;
		this.type = type;
	}
	
	String getBrand(){
		return this.brand;
	}
	
	String getModel(){
		return this.model;
	}
	
	String getTime(){
		return this.time;
	}
	
	boolean getAlarmOption(){
		return this.alarmOption;
	}
	
	WatchType getType(){
		return this.type;
	}
	
	void printValues(){
		System.out.println("Watch brand: "+brand);
		System.out.println("Watch model: "+model);
		System.out.println("Watch time: "+time);
        System.out.println("Alarm option: "+alarmOption);
		System.out.println("Watch type: "+type);
	}
}