public class HandCamera extends Camera{
	double weight;
	
	HandCamera(double weight){
		super("Nikon","Grey",CameraType.WIDE_LENS,80,30);
		this.weight = weight;
		System.out.println("Running double const in hand camera");
	}
}
		