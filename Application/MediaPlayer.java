public class MediaPlayer extends StandaloneApplication {

	Favourites[] fav;

	public MediaPlayer(String id, String name, AppType type, float version, String developer, String date, int size,
			String compatibleWith, Os type1, Favourites[] fav) {
		super(id, name, type, version, developer, date, size, compatibleWith, type1);
		this.fav = fav;
	}

	void play() {
		System.out.println("Running play method in Media player");
	}

	void delete() {
		System.out.println("Running delete method in Media player");
	}

	void download() {
		System.out.println("Running download method in Media player");
	}

}
