public class Stand {
	public static void main(String[] args){
		run();
		working();
		int returnInt = add();
		System.out.println(returnInt);

		byte returnByte = number();
		System.out.println(returnByte);

		short returnShort = sub();
		System.out.println(returnShort);

		long returnLong = salary();
		System.out.println(returnLong);

		float returnFloat = decimal();
		System.out.println(returnFloat);

		double returnDouble = deci();
		System.out.println(returnDouble);

		char returnChar = letter();
		System.out.println(returnChar);

		boolean returnBoolean = trOrFa();
		System.out.println(returnBoolean);

	}
	static void run(){
		System.out.println("Run the code");
	}
	static void working(){
		System.out.println("Code is working");
	}
	static int add(){
		int a=3;
		int b=2;
		int c=a+b;
		return c;
	}
	static byte number(){
		byte b1=9;
		return b1;
	}
	static short sub(){
		short studentid=1231;
		return studentid;
	}
	static long salary(){
		long person=50000;
		return person;
	}
	static float decimal(){
		float a=1.23f;
		return a;
	}
	static double deci(){
		double b=23.2334;
		return b;
	} 
	static char letter(){
		char c='a';
		return c;
	}
	static boolean trOrFa(){
		boolean w=true;
		return w;
	} 
}