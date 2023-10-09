public class Airpods{
	static String brandName;
	String color;
	static String chargingPort;
	int button;
	static int speakerBuds;
	int price;
	boolean anc;
	String modelNo;
	String batteryBackup;
	float ratings;
	
	static {
		brandName = "Boat";
		chargingPort = "c-type";
		speakerBuds = 2;
	}
	
	Airpods(String color,int button,int price,boolean anc,String modelNo,String batteryBackup,float ratings){
		this.color = color;
		this.button = button;
		this.price = price;
		this.anc = anc;
		this.modelNo = modelNo;
		this.batteryBackup = batteryBackup;
		this.ratings = ratings;
	}
	
	public static void main(String [] args){
		
		Airpods ap = new Airpods("Black",1,3999,true,"a-181","24hrs",4.5f);
		Airpods ap1 = new Airpods("White",1,2999,true,"a-121","24hrs",3.5f);
		Airpods ap2 = new Airpods("Red",1,4999,true,"a-281","24hrs",4.5f);
		
		if(ap!=null && ap1!=null && ap2!=null){
			System.out.println("Brand Name:"+ap.brandName);
			System.out.println("Color:"+ap.color);
			System.out.println("Charging Port:"+ap.chargingPort);
			System.out.println("Button:"+ap.button);
			System.out.println("Speaker Buds:"+ap.speakerBuds);
			System.out.println("Price:"+ap.price);
			System.out.println("ANC:"+ap.anc);
			System.out.println("Model number:"+ap.modelNo);
			System.out.println("Battery backup:"+ap.batteryBackup);
			System.out.println("Ratings:"+ap.ratings);
			
			System.out.println("------------------------------------------------");
			
			System.out.println("Brand Name:"+ap1.brandName);
			System.out.println("Color:"+ap1.color);
			System.out.println("Charging Port:"+ap1.chargingPort);
			System.out.println("Button:"+ap1.button);
			System.out.println("Speaker Buds:"+ap1.speakerBuds);
			System.out.println("Price:"+ap1.price);
			System.out.println("ANC:"+ap1.anc);
			System.out.println("Model number:"+ap1.modelNo);
			System.out.println("Battery backup:"+ap1.batteryBackup);
			System.out.println("Ratings:"+ap1.ratings);
			
			System.out.println("------------------------------------------------");
			System.out.println("Brand Name:"+ap2.brandName);
			System.out.println("Color:"+ap2.color);
			System.out.println("Charging Port:"+ap2.chargingPort);
			System.out.println("Button:"+ap2.button);
			System.out.println("Speaker Buds:"+ap2.speakerBuds);
			System.out.println("Price:"+ap2.price);
			System.out.println("ANC:"+ap2.anc);
			System.out.println("Model number:"+ap2.modelNo);
			System.out.println("Battery backup:"+ap2.batteryBackup);
			System.out.println("Ratings:"+ap2.ratings);
		
		}
	}
}
			
	
	
	