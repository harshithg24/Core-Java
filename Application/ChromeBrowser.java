public class ChromeBrowser extends Browser{
	
	ChromeBrowser(String id, String name, AppType type, float version, String developer, String date, int size,
			String compatibleWith, Os type1, Downloads[] down, BrowsingHistorySites[] history) {
		super(id, name, type, version, developer, date, size, compatibleWith, type1, down, history);
	}

	@Override
	void settings() {
		System.out.println("Running settings method in Chrome browser");
	}

	@Override
	void displayHistory() {
		System.out.println("Running display history method in Chrome browser");
	}

	@Override
	void ConsumerMemory() {
		System.out.println("Running consumer memory method in Chrome browser");
	}

	@Override
	void consumerInternet() {
		System.out.println("Running consummer internet method in Chrome browser");
	}

	@Override
	void run() {
		System.out.println("Running run method in Chrome browser");
	}

	@Override
	void stop() {
		System.out.println("Running stop method in Chrome browser");
	}

	@Override
	void execute() {
		System.out.println("Running execute method in Chrome browser");
	}

	@Override
	void collectInfo() {
		System.out.println("Running collect info method in Chrome browser");
	}

	@Override
	void displayInfo() {
		System.out.println("Running display info method in Chrome browser");
	}


}