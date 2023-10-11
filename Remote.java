public class Remote{
	public static void main(String[] args){
		TV tv = new TV("Sony",43,2,"4K resolution",true);
		
		if(tv!=null){
		System.out.println("Brand Name:"+tv.brandName);
		System.out.println("Number of buttons:"+TV.button);   //Staic variables 
		System.out.println("Shape of the TV:"+TV.shape);      //Static variables
		System.out.println("Size of the TV in inches:"+tv.displaySize);
		System.out.println("Number of USB ports:"+tv.usbPort);
		System.out.println("Speakers:"+TV.speaker);           //Static variables
		System.out.println("Display quality:"+tv.displayQuality);
		System.out.println("Is it Smart TV:"+tv.smartTV);
		}
		
		TV.watchingMovies();         //Static method
		
		TV.changingChannels();       //Staic method
		
		tv.usingInternet(true);    //Non static method
		
		tv.streamingOtt(true);    //Non static method 
	}
}
	
	class TV{
		String brandName;
		static int button;
		static String shape;
		int displaySize;
		int usbPort;
		static int speaker;
		String displayQuality;
		boolean smartTV;
		
		static {
			button = 1;
			shape = "Rectangle";
			speaker = 2;
		}
		
		TV(String brandName,int displaySize,int usbPort,String displayQuality,boolean smartTV){
			this.brandName = brandName;
			this.displaySize = displaySize;
			this.usbPort = usbPort;
			this.displayQuality = displayQuality;
			this.smartTV = smartTV;
		}
		
		public static void watchingMovies(){
			System.out.println("Watching movies");
		}
		
		public static void changingChannels(){
			System.out.println("Change the channels");
		}
		
		public void usingInternet(boolean smartTV){
			System.out.println("Use the internet");
		}
		
		public void streamingOtt(boolean smartTV){
			System.out.println("Watching online movies");
		}
	}
			
		
		