public class FireFoxBrowser extends Browser{
	
	FireFoxBrowser(String id, String name, AppType type, float version, String developer, String date, int size,
			String compatibleWith, Os type1, Downloads[] down, BrowsingHistorySites[] history) {
		super(id, name, type, version, developer, date, size, compatibleWith, type1, down, history);
	}
	
	@Override
	void settings() {
		System.out.println("Running settings method in Firefox browser");
	}

	@Override
	void displayHistory() {
		System.out.println("Running display history method in Firefox browser");
	}

	@Override
	void ConsumerMemory() {
		System.out.println("Running consumer memory method in Firefox browser");
	}

	@Override
	void consumerInternet() {
		System.out.println("Running consummer internet method in Firefox browser");
	}

	@Override
	void run() {
		System.out.println("Running run method in Firefox browser");
	}

	@Override
	void stop() {
		System.out.println("Running stop method in Firefox browser");
	}

	@Override
	void execute() {
		System.out.println("Running execute method in Firefox browser");
	}
	
	@Override
	void collectInfo() {
		System.out.println("Running collect info method in Firefox browser");
	}

	@Override
	void displayInfo() {
		System.out.println("Running display info method in Firefox browser");
	}

}
