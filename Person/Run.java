public class Run{
	
	public static void main(String [] args){
		
		App app = new App();
		
		String[] skill = {"C","C++","Java"};
		
		Person per1 = new Person("Niranjan",22,75.8f,5.7f,skill);
		Person per2 = new Person("Manoj",21,85.8f,6.0f,skill);
		Person per3 = new Person("Nithin",22,65.4f,4.7f,skill);
		Person per4 = new Person("Amith",22,75.8f,5.3f,skill);
		Person per5 = new Person("Akshay",22,77.8f,5.7f,skill);
		Person per6 = new Person("Yashwanth",23,66.8f,6.7f,skill);
		Person per7 = new Person("Arjun",24,75.8f,5.0f,skill);
		Person per8 = new Person("Anirudh",22,70.2f,6.7f,skill);
		Person per9 = new Person("Sudeep",22,75.8f,4.7f,skill);
		Person per10 = new Person("Raghu",24,80.8f,5.7f,skill);
		
		app.savePersonDetails(per1);
		app.savePersonDetails(per2);
		app.savePersonDetails(per3);
		app.savePersonDetails(per4);
		app.savePersonDetails(per5);
		app.savePersonDetails(per6);
		app.savePersonDetails(per7);
		app.savePersonDetails(per8);
		app.savePersonDetails(per9);
		app.savePersonDetails(per10);
	}
}
		
		
		
		