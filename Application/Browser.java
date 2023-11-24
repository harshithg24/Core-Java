public class Browser  extends StandaloneApplication{

	Downloads[] down;
	BrowsingHistorySites[] history;
	public Browser(String id, String name, AppType type, float version, String developer, String date, int size,
			String compatibleWith, Os type1, Downloads[] down, BrowsingHistorySites[] history) {
		super(id, name, type, version, developer, date, size, compatibleWith, type1);
		this.down = down;
		this.history = history;
	}

	void settings() {
		System.out.println("Running settings method in Browser");
	}

	void displayHistory() {
		System.out.println("Running display history in browser");
	}

}