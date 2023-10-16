public class Computer{
	static String wallpaper;
    static int noOfFolders;
    static String time;
	static String date;
	static int desktopWind;
	String foldNam;
	Battery status;
	int sound;
	int brightness;
	boolean bluetooth;
	String word[] = {"Computer"};
	String compName = "Lenovo";
	
	static {
		wallpaper = "Windows default picture";
		noOfFolders = 8;
		time = "09:54";
		date = "16/10/2023";
		desktopWind = 1;
	}
	
	Computer(String foldNam,Battery status,int sound,int brightness,boolean bluetooth){
		this("Project,Internship,Trip pictures",Battery.CHARGED,80,90);
		this.bluetooth = bluetooth;
		System.out.println("5 Parameter COnstructor");
	}
	
	Computer(String foldNam,Battery status,int sound,int brightness){
		this("Project,Internship,Trip pictures",Battery.CHARGED,80);
		this.brightness = brightness;
		System.out.println("4 Parameter COnstructor");
	}
	
	Computer(String foldNam,Battery status,int sound){
		this("Project,Internship,Trip pictures",Battery.CHARGED);
		this.sound = sound;
		System.out.println("3 Parameter COnstructor");
	}
	
	Computer(String foldNam,Battery status){
		this("Project,Internship,Trip pictures");
		this.status = status;
		System.out.println("2 Parameter COnstructor");
	}
	
	Computer(String foldNam){
		System.out.println("1 Parameter COnstructor");
		
	}
	
	
	public void printAllMethod(){
		System.out.println("Printing all the methods");
		System.out.println(Computer.wallpaper);
		    System.out.println(Computer.noOfFolders);
		    System.out.println(Computer.desktopWind);
			System.out.println(Computer.time);
			System.out.println(Computer.date);
			System.out.println(foldNam);
			System.out.println(status);
			System.out.println(sound);
			System.out.println(brightness);
			System.out.println(bluetooth);
	
    }
	
	public  void printValuesOfArray(){
		for(int i=0;i<word.length;i++){
		System.out.println("array values "+ word[i]);
		}
	}
	
	public String getComputerName(){
		return compName;
	}
}

    
	
	
	
	