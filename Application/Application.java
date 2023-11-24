public class Application{
	 
	 String id;
	 String name;
	 AppType type;
	 float version;
	 String developer;
	 String date;
	 
	 public Application(String id, String name, AppType type, float version, String developer, String date) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.version = version;
		this.developer = developer;
		this.date = date;
	}

	void run() {
		 System.out.println("Running run method in application");
	 }
	 
	 void stop() {
		 System.out.println("Running stop method in Application");
	 }
	 
	 void execute() {
		 System.out.println("Running execute method in Application");
	 }
	 
	 void collectInfo() {
		 System.out.println("Running collect information method in Application");
	 }
	 
	 void displayInfo() {
		 System.out.println("Running display information method in Application");
	 }

}

	 
	 