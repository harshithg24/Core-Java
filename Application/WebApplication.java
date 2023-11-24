public class WebApplication extends Application{

	SupportedBrowsers[] browser;
	boolean free;

	WebApplication(String id, String name, AppType type, float version, String developer, String date,
			SupportedBrowsers[] browser, boolean free) {
		super(id, name, type, version, developer, date);
		this.browser = browser;
		this.free = free;
	}

	void connectInternet() {
		System.out.println("Running Connect internet method in Web appliction");
	}

	void sendUsage() {
		System.out.println("Running send usage in web application");
	}

}