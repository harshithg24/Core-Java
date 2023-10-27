public class VGameApp{
	
	VideoGame[] videoGame = new VideoGame[5];
	
	boolean storeGame(VideoGame vGame){
		
		boolean validGame = validateGame(vGame);
		
		if(validGame){
			
			for(int i=0;i<videoGame.length;i++){
				
				if(videoGame[i]==null){
					videoGame[i]=vGame;
					System.out.println("Successfully saved!" + vGame.getName());
					return true;
				}
				else{
					System.out.println("Index is not empty, so it is not saved");
				}
			}
			System.out.println("Index has no sapce");
			return false;
		}
		System.out.println("Game Not saved");
		return false;
	}
	
	boolean validateGame(VideoGame vGame){
		
		if(vGame!=null){
			if(vGame.getName()!=null && vGame.getName().length()>3){
				if(vGame.getNumberOfPlayers()>1){
					if(vGame.getNumberOfLevels()>10){
						if(vGame.getCharacters().length>4){
							return true;
						}
						else{
							System.out.println("Cahracters are not valid");
							return false;
						}
					}
					else{
						System.out.println("Number of levels are not valid");
						return false;
					}
				}
				else{
					System.out.println("number of players are not valid");
					return false;
				}
			}
			else{
				System.out.println("Name is not valid");
				return false;
			}	
		}
		else{
			System.out.println("Video game is not valid");
			return false;
		}
	}
}