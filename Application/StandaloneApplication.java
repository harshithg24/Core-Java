public class StandaloneApplication extends Application{
	
	int size;
	String compatibleWith;
	Os type1;
	
	StandaloneApplication(String id, String name, AppType type, float version, String developer, String date,
				int size, String compatibleWith, Os type1) {
			super(id, name, type, version, developer, date);
			this.size = size;
			this.compatibleWith = compatibleWith;
			this.type1 = type1;
		}
		
		void ConsumerMemory() {
			System.out.println("Running consumer memory method in Standalone application");
		}
		
		void consumerInternet() {
			System.out.println("Running consumer internet method in Standalone application");
		}
		
}

	
