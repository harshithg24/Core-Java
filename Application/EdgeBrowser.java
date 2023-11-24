public class EdgeBrowser extends Browser{
	
	EdgeBrowser(String id, String name, AppType type, float version, String developer, String date, int size,
			String compatibleWith, Os type1, Downloads[] down, BrowsingHistorySites[] history) {
		super(id, name, type, version, developer, date, size, compatibleWith, type1, down, history);
	}

	@Override
	void settings() {
		System.out.println("Running settings method in Edge browser");
	}

	@Override
	void displayHistory() {
		System.out.println("Running display history method in Edge browser");
	}

	@Override
	void ConsumerMemory() {
		System.out.println("Running consumer memory method in Edge browser");
	}

	@Override
	void consumerInternet() {
		System.out.println("Running consummer internet method in Edge browser");
	}

	@Override
	void run() {
		System.out.println("Running run method in Edge browser");
	}

	@Override
	void stop() {
		System.out.println("Running stop method in Edge browser");
	}

	@Override
	void execute() {
		System.out.println("Running execute method in Edge browser");
	}

	@Override
	void collectInfo() {
		System.out.println("Running collect info method in Edge browser");
	}

	@Override
	void displayInfo() {
		System.out.println("Running display info method in Edge browser");
	}

}
