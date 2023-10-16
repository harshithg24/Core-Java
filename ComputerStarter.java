public class ComputerStarter{
	public static void main(String[] args){
		
		Computer com = new Computer("Project,Internship,Trip pictures",Battery.CHARGED,80,90,true);
		Computer com1 = new Computer("New project,Internship report,pictures",Battery.CHARGED,10,50,true);
		Computer com2 = new Computer("Project work,Internship document,Trip list",Battery.CHARGING,80,30,false);
		Computer com3 = new Computer("Project Flowchart,Internship slides,Trip pictures",Battery.CHARGED,60,90,true);
		
		com.printAllMethod();
	    com.printValuesOfArray();
		String computerName = com.getComputerName();
		System.out.println(computerName);
		
		if(com!=null && com1!=null && com2!=null && com3!=null){
			
			
			System.out.println(Computer.wallpaper);
		    System.out.println(Computer.noOfFolders);
		    System.out.println(Computer.desktopWind);
			System.out.println(Computer.time);
			System.out.println(Computer.date);
			System.out.println(com.foldNam);
			System.out.println(com.status);
			System.out.println(com.sound);
			System.out.println(com.brightness);
			System.out.println(com.bluetooth);
			
			System.out.println("---------------------------------------------------");
			
			System.out.println(Computer.wallpaper);
		    System.out.println(Computer.noOfFolders);
		    System.out.println(Computer.desktopWind);
			System.out.println(Computer.time);
			System.out.println(Computer.date);
			System.out.println(com1.foldNam);
			System.out.println(com1.status);
			System.out.println(com1.sound);
			System.out.println(com1.brightness);
			System.out.println(com1.bluetooth);
			
			System.out.println("---------------------------------------------------");
		
		    System.out.println(Computer.wallpaper);
		    System.out.println(Computer.noOfFolders);
		    System.out.println(Computer.desktopWind);
			System.out.println(Computer.time);
			System.out.println(Computer.date);
			System.out.println(com2.foldNam);
			System.out.println(com2.status);
			System.out.println(com2.sound);
			System.out.println(com2.brightness);
			System.out.println(com2.bluetooth);
			
			System.out.println("---------------------------------------------------");
			
			System.out.println(Computer.wallpaper);
		    System.out.println(Computer.noOfFolders);
		    System.out.println(Computer.desktopWind);
			System.out.println(Computer.time);
			System.out.println(Computer.date);
			System.out.println(com3.foldNam);
			System.out.println(com3.status);
			System.out.println(com3.sound);
			System.out.println(com3.brightness);
			System.out.println(com3.bluetooth);
		}
	}
}
			