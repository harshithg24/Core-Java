public class Plastic{
	public static void main(String[] args){
		new Plastic();
		new Plastic(1.345f);
	}
	Plastic(){
		System.out.println("Using no parameter in constructor");
	}
	Plastic(float firstValue){
		System.out.println("Using parameter in constructor");
		System.out.println(firstValue);
	}
}