public class Hello{
	public static void main(String[] args){
		new Hello();
		new Hello(24);
	}
		Hello(){
			System.out.println("Using no parameter in constructor");
		}
		
		Hello(int firstValue){
			System.out.println("Using parameter in constructor");
			System.out.println(firstValue);
		}
		
}