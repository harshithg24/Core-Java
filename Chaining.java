public class Chaining{
	Chaining(int firstValue,int secondValue,String word,boolean check)
	{
		System.out.println("four parameter constructor");
	}
	Chaining(int firstValue,float secondValue,boolean check){
		this(8,2,"chain",true);
		System.out.println("three parameter constructor");
	}
	Chaining(int firstValue,int SecondValue){
		this(9,5.4f,true);
		System.out.println("two parameter constructor");
	}
	Chaining(int firstValue){
		this(7,3);
		System.out.println("one parameter constructor");
	}
	Chaining(){
		this(1);
		System.out.println("no parameter constructor");
	}
	public static void main(String[] args){
		new Chaining();
	}		
}