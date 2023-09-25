public class Desktop{
	public static void main(String[] args){
		new Desktop();
		new Desktop(1.345456);
	}
	Desktop(){
		System.out.println("Using no parameter in constructor");
	}
	Desktop(double firstValue){
		System.out.println("Using parameter in constructor");
		System.out.println(firstValue);
	}
}