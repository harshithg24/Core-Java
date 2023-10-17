public class MethodString{
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
		
		String employeeNam = new String("Manoj");
		String gender1 = new String("Male");
		String qualification1 = new String(" Bachelor of Engineering ");
		String collegeName1 = new String("Jawaharlal Nehru New COllege of Engineering");
		String schoolName1 = new String("Seshadripuram High School");
		String company1 = new String(" Infosys ");
		String location1 = new String("Bengaluru");
		String designation1 = new String("Tester");
        String maritalStatus1 = new String("Single");	
        String ownsVehicle1 = new String("Bike");		
		
		System.out.println(employeeNam);
		
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
	}
}