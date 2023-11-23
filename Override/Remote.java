public class Remote{
	
	RemoteUsed usedFor;
	int totalButtons;
	boolean original;
	
	Remote(RemoteUsed usedFor,int totalButtons,boolean original){
		this.usedFor = usedFor;
		this.totalButtons = totalButtons;
		this.original = original;
		System.out.println("Running RemoteUsed,int,boolean const of Remote");
	}
	
	void on(){
		System.out.println("Running on method in Remote");
	}
	
	void off(){
		System.out.println("Running off method in remote");
	}
	
	void increaseVolume(){
		System.out.println("Running increase value method in remote");
	}
	
	void decreaseVolume(){
		System.out.println("Running decrease volume method in remote");
	}
	
	void changeChannel(){
		System.out.println("Running change channel method in remote");
	}
}