public class LaminatedGlass extends Glass{
	
	double cost;
	int warranty;
	
	LaminatedGlass(double cost,int warranty){
		super(24,4,GlassType.LAMINATED_GLASS,"Security","Saflex");
		this.cost = cost;
		this.warranty = warranty;
		System.out.println("Running double , int const of LaminatedGlass");
	}
}