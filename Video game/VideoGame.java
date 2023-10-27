public class VideoGame{
	String name;
	int numberOfPlayers;
	int numberOfLevels; 
	GameType type;
	boolean isFree;
	String[] characters;
	
	VideoGame(String name,int numberOfPlayers,int numberOfLevels,GameType type,boolean isFree,String[] characters){
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
		this.numberOfLevels = numberOfLevels;
		this.type = type;
		this.isFree = isFree;
		this.characters = characters;
	}
	
	String getName(){
		return this.name;
	}
	
	int getNumberOfPlayers(){
		return this.numberOfPlayers;
	}
	
	int getNumberOfLevels(){
		return this.numberOfLevels;
	}
	
	GameType getType(){
		return this.type;
	}
	
	boolean getIsFree(){
		return this.isFree;
	}
	
	String[] getCharacters(){
		return this.characters;
	}
	
	void printValues(){
		System.out.println("Name of the Video game: "+name);
		System.out.println("Number of players: "+numberOfPlayers);
		System.out.println("Number of levels: "+numberOfLevels);
		System.out.println("Game type: "+type);
		System.out.println("Game is free: "+isFree);
		for(int i=0;i<characters.length;i++){
		System.out.println("Characters: "+characters[i]);
		}
		System.out.println("---------------------------------------------------");
	}
}
		