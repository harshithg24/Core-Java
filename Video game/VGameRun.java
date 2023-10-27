public class VGameRun{
	public static void main(String[] args){
	VGameApp app = new VGameApp();
	
	String[] vc = {"Geralt","Rivia","Xennefer","Vengerberg","Ciri"};
	String[] vc1 = {"Tracer","Reaper","MercY","Lena","Gabriel"};
	String[] vc2 = {"Mario","Princess","Peach","Bowser","Angela"};
	String[] vc3 = {"Link","Zelda","Genon","Rozer","Glen"};
	String[] vc4 = {"Shepard","Garrus","Rayya","vakarian","Zorah"};
	
	VideoGame vg = new VideoGame("The witcher 3",4,20,GameType.ACTION,true,vc);
	VideoGame vg1 = new VideoGame("Overwatch Shooting",5,15,GameType.SHOOTING,false,vc1);
	VideoGame vg2 = new VideoGame("Super Mario Odyssey",4,20,GameType.PLATFORMER,true,vc2);
	VideoGame vg3 = new VideoGame("The Legend of Zelda",4,20,GameType.ACTION_ADVENTURE,true,vc3);
	VideoGame vg4 = new VideoGame("Mass Effect",4,20,GameType.ACTION,true,vc4);
	
	app.storeGame(vg);
	app.storeGame(vg1);
	app.storeGame(vg2);
	app.storeGame(vg3);
	app.storeGame(vg4);
	
	vg.printValues();
	vg1.printValues();
	vg2.printValues();
	vg3.printValues();
	vg4.printValues();
	}
}
	