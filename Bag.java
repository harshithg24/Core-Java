public class Bag{
	public static void main(String[] args){
		new Bag();
		new Bag('A');
	}
	Bag(){
		System.out.println("Using no parameter in constructor");
	}
	Bag(char firstValue){
		System.out.println("Using parameter in constructor");
		System.out.println(firstValue);
	}
}