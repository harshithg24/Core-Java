public class RemoteRunner{
	
	public static void main(String... value){
		
		Remote remote = new Remote(RemoteUsed.TELEVISION,28,true);
		System.out.println("Remote used for:"+remote.usedFor);
		System.out.println("Total buttons:"+remote.totalButtons);
		System.out.println("Original"+remote.original);
		remote.on();
		remote.off();
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.changeChannel();
		
		System.out.println("-----------------------------------------------");
		
		LgRemote lgremote = new LgRemote(2,2);
		System.out.println("LG Remote used for:"+lgremote.usedFor);
		System.out.println("Total buttons:"+lgremote.totalButtons);
		System.out.println("Original"+lgremote.original);
		System.out.println("Warranty:"+lgremote.warranty);
		System.out.println("Total batteries:"+lgremote.totalBatteries);
		lgremote.on();
		lgremote.off();
	}
}
		
		
		
		