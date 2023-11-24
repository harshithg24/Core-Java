public class Favourites {
	
	String value;

	public Favourites(String value) {
		super();
		this.value = value;
		
		printValues();
	}
	
	void printValues(){
		System.out.println("Favourites Artist:"+value);
	}


}
