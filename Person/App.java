public class App{
	
	Person[] perArray = new Person[10];
	
	boolean savePersonDetails(Person per){
		
		for(int index=0;index<perArray.length;index++){
			
			if(perArray[index]==null){
				perArray[index] = per;
				System.out.println("Successfully saved");
				return true;
			}
			
			else{
				System.out.println("Index is not empty,so going to nxt index");
			}	
		}
		System.out.println("No space to save");
		return false;
	}
}
			
	