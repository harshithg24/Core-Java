

public class StringMethods{
	public static void main(String[] args){
		String employeeName = "Harshith";
		String gender = "Male";
		String qualification = " Bachelor of Engineering ";
		String collegeName = "Jawaharlal Nehru New COllege of Engineering";
		String schoolName = "Seshadripuram High School";
		String company = " Infosys ";
		String location = "Bengaluru";
		String designation = "Tester";
		String maritalStatus = "Single";
		String ownsVehicle = "Bike";
		
		int length = employeeName.length();
		System.out.println(length);
		 
		boolean equalStringCheck = gender.equals(location);
		System.out.println(equalStringCheck);
		
		char indexedChar = location.charAt(4);
		System.out.println(indexedChar);
		
		String lowCaseString = company.toLowerCase();
		System.out.println(lowCaseString);
		
		String upCaseString = company.toUpperCase();
		System.out.println(upCaseString);
		
		String trimmedString = qualification.trim();
		System.out.println(trimmedString);
		
		String valueOfString = maritalStatus.valueOf(24);
		System.out.println(valueOfString);
		
		int charValue = gender.codePointAt(2);
		System.out.println(charValue);
		
		boolean equalsCheck = employeeName.equalsIgnoreCase(gender);
		System.out.println(equalsCheck);
		
		String concatString = employeeName.concat(location);
		System.out.println(concatString);
		
		String replacedString = gender.replace('l','k');
		System.out.println(replacedString);
		
		int charBeforeValue = employeeName.codePointBefore(1);
		System.out.println(charBeforeValue);
		
		boolean charStartsWith = employeeName.startsWith("Ha");
		System.out.println(charStartsWith);
		
		boolean charEndsWith = employeeName.endsWith("ith");
		System.out.println(charEndsWith);
		
		int indexOfChar = schoolName.indexOf("School");
		System.out.println(indexOfChar);
		
		char[] charArray = schoolName.toCharArray();
		for(int i=0;i<charArray.length;i++)
	    System.out.println(charArray[i]);
		
		String[] splitString = collegeName.split(" ");
		for(int i=0;i<splitString.length;i++)
		System.out.println(splittedString[i]);
		
		
		

	}		
		
	}

	