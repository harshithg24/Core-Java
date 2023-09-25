public class Stall{
	public static void main(String[] args){
		new Stall();
		new Stall(true);
	}
	Stall(){
		System.out.println("Using no parameter in constructor");
	}
	Stall(boolean firstValue){
		System.out.println("Using parameter in constructor");
		System.out.println(firstValue);
	}
}