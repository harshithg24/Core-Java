public class CameraRunner{
	
	public static void main(String... value){
		
		Camera cam = new Camera("Sony","Black",CameraType.SHORT_LENS,90,20);
		System.out.println("Camera Brand:"+cam.brand);
		System.out.println("Color:"+cam.color);
		System.out.println("Type:"+cam.type);
		System.out.println("Pixel:"+cam.pixel);
		System.out.println("Battery Capacity in mah:"+cam.batteryDuration);
		
	    System.out.println("---------------------------------------------------------");
		
		DigitalCamera digi = new DigitalCamera();
		System.out.println("Camera Brand:"+digi.brand);
		System.out.println("Color:"+digi.color);
		System.out.println("Type:"+digi.type);
		System.out.println("Pixel:"+digi.pixel);
		System.out.println("Battery Capacity in mah:"+digi.batteryDuration);
		
		System.out.println("---------------------------------------------------------");
		
		HandCamera hand = new HandCamera(500);
		System.out.println("Camera Brand:"+hand.brand);
		System.out.println("Color:"+hand.color);
		System.out.println("Type:"+hand.type);
		System.out.println("Pixel:"+hand.pixel);
		System.out.println("Battery Capacity in mah:"+hand.batteryDuration);
		System.out.println("weight:"+hand.weight);
		
	}
}
		
		