public class Tap {
	public static void main(String[] args){
		int divideValue = divide(50,10);
		System.out.println(divideValue);

		int divideValue1 = divide(50,5,2);
		System.out.println(divideValue);

		charge('N');

		charge(true);

		open(10,2.345f);

		open(4.567f,66);
	}

	static int divide(int firstValue,int secondValue){
		System.out.println("Using Two Parameter");
		int quotientValue = firstValue/secondValue;
		return quotientValue;
	}

	static int divide(int firstValue,int secondValue,int thirdValue){
		System.out.println("Using Three Parameter");
		int quotientValue = firstValue/secondValue*thirdValue;
		return quotientValue;
	}

	static void charge(char letter){
		System.out.println("Using char datatype");
		System.out.println(letter);
	}

	static void charge(boolean letter){
		System.out.println("Using boolean datatype");
		System.out.println(letter);
	}

	static void open(int firstValue,float secondValue){
		System.out.println("Changing the order");
		System.out.println(firstValue+","+secondValue);
	}

	static void open(float secondValue,int firstValue){
		System.out.println("Changing the order");
		System.out.println(secondValue+","+firstValue);
	}


}