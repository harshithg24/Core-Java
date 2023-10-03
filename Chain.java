public class Chain{
	Chain(int firstValue,int secondValue,char letter,boolean check)
	{
		System.out.println("four parameter constructor");
	}
	Chain(int firstValue,float secondValue,char letter){
		this(3,4,'A',true);
		System.out.println("three parameter constructor");
	}
	Chain(int firstValue,int SecondValue){
		this(4,3.4f,'A');
		System.out.println("two parameter constructor");
	}
	Chain(int firstValue){
		this(3,4);
		System.out.println("one parameter constructor");
	}
	Chain(){
		this(6);
		System.out.println("no parameter constructor");
	}
	public static void main(String[] args){
		new Chain();
	}		
}