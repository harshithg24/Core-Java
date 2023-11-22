public class ToughenedGlass extends Glass{
	
	double weight;
	String ownerName;
	
	ToughenedGlass(double weight,String ownerName){
		super(50,5,GlassType.TOUGHENED_GLASS,"Construction","Vanceva");
		this.weight = weight;
		this.ownerName = ownerName;
		System.out.println("Running double,String const in toughened glass");
	}
	
}
	