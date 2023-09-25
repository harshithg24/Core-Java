public class Board{
	public static void main(String[] args){
		evenOrOdd(12);
		evenOrOdd(11);
		
		result(30);
		result(55);
		result(65);
		result(85);
		
		posOrNeg(5);
		posOrNeg(0);
		posOrNeg(-5);
		
		lessOrGreat(25);
		lessOrGreat(75);
		
		checkAge(16);
		checkAge(20);
		
	}
	
	static void evenOrOdd(int value){
		if(value%2==0){
			System.out.println("The "+value+" number is Even");
		}
		
		else {
			System.out.println("The "+value+" number is Odd");
		}
	}
	
	static void result(int studentMarks){
		if(studentMarks<35){
			System.out.println("Fail");
		}
		else if(studentMarks>=35 && studentMarks<60){
			System.out.println("Second class");
		}
		else if(studentMarks>=60 && studentMarks<85){
			System.out.println("First class");
		}
		else {
			System.out.println("Distinction");
		}
	}
	
	static void posOrNeg(int num){
		if (num>0){
			System.out.println("The "+num+" number is Positive");
		}
		else if(num==0){
			System.out.println("The "+num+" number is zero");
		}
		else {
			System.out.println("The "+num+" number is Negative");
		}
	}
	
	static void lessOrGreat(int firstValue){
		if (firstValue<50){
			System.out.println("The "+firstValue+" is lesser than 50");
		}
		else{
			System.out.println("The "+firstValue+" is greater than 50");
		}
	}
	
	static void checkAge(int age){
		if(age<18){
			System.out.println("Below 18 not allowed to drive the vehicle");
		}
        else{
        System.out.println("Above 18 are allowed to drive the vehicle");
        }
	}	
	
}