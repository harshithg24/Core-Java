public class LaptopAnalysis {
	String brand;
	int manufYear;
    String modelName;
    static int ramInGB;
    static int ssdInGB;
    float inches;
    static String os;
    String generation;
    String anyDamage;
    int weightInGrams;	
	
	static {
		ramInGB = 8;
		ssdInGB = 256;
		os = "windows";
	}
	
	LaptopAnalysis(String brand,int manufYear,String modelName,float inches,String generation,String anyDamage,int weightInGrams){
	this.brand=brand;
	this.manufYear=manufYear;
    this.modelName=modelName;
    this.inches=inches;
    this.generation=generation;
    this.anyDamage=anyDamage;
    this.weightInGrams=weightInGrams;	
	}
	
	public static void main(String[] args){
		
		LaptopAnalysis ls =new LaptopAnalysis("Lenovo",2015,"S540 Ideapad",13.3f,"10th generation","keyboard is not proper",1530);
		LaptopAnalysis ls1 =new LaptopAnalysis("HP",2020,"Ultrabook",13.2f,"!!th generation","Display is not working",1204);
		LaptopAnalysis ls2 =new LaptopAnalysis("Dell",2018,"Notebook",13.4f,"8th generation","camera problem",1304);
		
		if(ls!=null && ls1!=null && ls2!=null){
		System.out.println("Brand Name:" + ls.brand);
		System.out.println("Manufactured year:" + ls.manufYear);
		System.out.println("Model name:" + ls.modelName);
		System.out.println("RAM in GB:" + ls.ramInGB);
		System.out.println("SSD in GB:" + ls.ssdInGB);
		System.out.println("Inches:" + ls.inches);
		System.out.println("Operating system:" + ls.os);
		System.out.println("Generation:" + ls.generation);
		System.out.println("Any Damage:" + ls.anyDamage);
		System.out.println("weight In Grams:" + ls.weightInGrams);
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Brand Name:" + ls1.brand);
		System.out.println("Manufactured year:" + ls1.manufYear);
		System.out.println("Model name:" + ls1.modelName);
		System.out.println("RAM in GB:" + ls1.ramInGB);
		System.out.println("SSD in GB:" + ls1.ssdInGB);
		System.out.println("Inches:" + ls1.inches);
		System.out.println("Operating system:" + ls1.os);
		System.out.println("Generation:" + ls1.generation);
		System.out.println("Any Damage:" + ls1.anyDamage);
		System.out.println("weight In Grams:" + ls1.weightInGrams);
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Brand Name:" + ls2.brand);
		System.out.println("Manufactured year:" + ls2.manufYear);
		System.out.println("Model name:" + ls2.modelName);
		System.out.println("RAM in GB:" + ls2.ramInGB);
		System.out.println("SSD in GB:" + ls2.ssdInGB);
		System.out.println("Inches:" + ls2.inches);
		System.out.println("Operating system:" + ls2.os);
		System.out.println("Generation:" + ls2.generation);
		System.out.println("Any Damage:" + ls2.anyDamage);
		System.out.println("weight In Grams:" + ls2.weightInGrams);
		}
		
	}
}