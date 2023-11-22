public class GlassRunner{
	
	public static void main(String... values){
		
		Glass glass = new Glass(50,3,GlassType.TOUGHENED_GLASS,"Construction","Du point");
		System.out.println("Brand:"+glass.brand);
		System.out.println("Length:"+glass.length);
		System.out.println("Thickness:"+glass.thickness);
		System.out.println("Type:"+glass.type);
		System.out.println("Usage:"+glass.usage);
		
		System.out.println("----------------------------------------------------------------------------");
		
		LaminatedGlass lami = new LaminatedGlass(10000,1);
		System.out.println("Brand:"+lami.brand);
		System.out.println("Length:"+lami.length);
		System.out.println("Thickness:"+lami.thickness);
		System.out.println("Type:"+lami.type);
		System.out.println("Usage:"+lami.usage);
		System.out.println("Cost:"+lami.cost);
		System.out.println("Warranty:"+lami.warranty);
		
		System.out.println("----------------------------------------------------------------------------");
		
		ToughenedGlass tough = new ToughenedGlass(5,"Shekar");
		System.out.println("Brand:"+tough.brand);
		System.out.println("Length:"+tough.length);
		System.out.println("Thickness:"+tough.thickness);
		System.out.println("Type:"+tough.type);
		System.out.println("Usage:"+tough.usage);
		System.out.println("Weight:"+tough.weight);
		System.out.println("Owner name:"+tough.ownerName);
		
		System.out.println("----------------------------------------------------------------------------");
		
		TintedGlass tint = new TintedGlass();
		System.out.println("Brand:"+tint.brand);
		System.out.println("Length:"+tint.length);
		System.out.println("Thickness:"+tint.thickness);
		System.out.println("Type:"+tint.type);
		System.out.println("Usage:"+tint.usage);
		System.out.println("Weight"+tint.weight);
		System.out.println("Owner name:"+tint.ownerName);
		
        System.out.println("----------------------------------------------------------------------------");
		
		GorillaGlass gorilla = new GorillaGlass();
		System.out.println("Brand:"+gorilla.brand);
		System.out.println("Length:"+gorilla.length);
		System.out.println("Thickness:"+gorilla.thickness);
		System.out.println("Type:"+gorilla.type);
		System.out.println("Usage:"+gorilla.usage);
		System.out.println("Cost:"+gorilla.cost);
		System.out.println("Warranty:"+gorilla.warranty);
	}
}