public class Camera{
	
	String brand;
	String color;
	CameraType type;
	int pixel;
	int batteryDuration;
	
	Camera(String brand,String color,CameraType type,int pixel,int batteryDuration){
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.pixel = pixel;
		this.batteryDuration = batteryDuration;
		System.out.println("Running String,String,CameraType,int,int const of Camera");
	}
	
	void clicksPicture(){
		System.out.println("Clicks the picture");
	}
}
	