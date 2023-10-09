public class Movie{
	String movieName;
	String actor;
	String actress;
	static String director;
	static String musicDirector;
	String producer;
	String distribution;
	static String cameraMen;
	int noOfSongs;
	int budget;
	
	static {
		director = "Prashant Neel";
		musicDirector = "Ravi Basur";
		cameraMen = "Bhuvan Gowda";
	}
	
	Movie(String movieName,String actor,String actress,String producer,String distribution,int noOfSongs,int budget){
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.producer = producer;
		this.distribution = distribution;
		this.noOfSongs = noOfSongs;
		this.budget = budget;
	}
	
	public static void main(String[] args){
		
		Movie mo = new Movie("Ugramm","Srimurali","Haripriya","Vijay Kiragandur","KRG Studios",5,50000000);
		Movie mo1 = new Movie("K.G.F","Yash","Srinidhi","Vijay Kiragandur","KRG Studios",4,600000000);
		Movie mo2 = new Movie("K.G.F-2","Yash","Srinidhi","Vijay Kiragandur","KRG Studios",4,900000000);
		
		if(mo!=null && mo1!=null && mo2!=null){
			System.out.println("Movie Name:"+mo.movieName);
			System.out.println("Actor:"+mo.actor);
			System.out.println("Actress:"+mo.actress);
			System.out.println("Director:"+mo.director);
			System.out.println("Music director:"+mo.musicDirector);
			System.out.println("Producer:"+mo.producer);
			System.out.println("Distribution:"+mo.distribution);
			System.out.println("Camera men:"+mo.cameraMen);
			System.out.println("Number of songs:"+mo.noOfSongs);
			System.out.println("Budget:"+mo.budget);
			
			System.out.println("----------------------------------------------------");
			
			System.out.println("Movie Name:"+mo1.movieName);
			System.out.println("Actor:"+mo1.actor);
			System.out.println("Actress:"+mo1.actress);
			System.out.println("Director:"+mo1.director);
			System.out.println("Music director:"+mo1.musicDirector);
			System.out.println("Producer:"+mo1.producer);
			System.out.println("Distribution:"+mo1.distribution);
			System.out.println("Camera men:"+mo1.cameraMen);
			System.out.println("Number of songs:"+mo1.noOfSongs);
			System.out.println("Budget:"+mo1.budget);
			
			System.out.println("----------------------------------------------------");
			
			System.out.println("Movie Name:"+mo2.movieName);
			System.out.println("Actor:"+mo2.actor);
			System.out.println("Actress:"+mo2.actress);
			System.out.println("Director:"+mo2.director);
			System.out.println("Music director:"+mo2.musicDirector);
			System.out.println("Producer:"+mo2.producer);
			System.out.println("Distribution:"+mo2.distribution);
			System.out.println("Camera men:"+mo2.cameraMen);
			System.out.println("Number of songs:"+mo2.noOfSongs);
			System.out.println("Budget:"+mo2.budget);
			
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
		
		
	
	