public class LgRemote extends Remote{
	
	int warranty;
	int totalBatteries;
	
	LgRemote(int warranty,int totalBatteries){
		super(RemoteUsed.TELEVISION,25,true);
		this.warranty = warranty;
		this.totalBatteries = totalBatteries;
		System.out.println("Running int,int const of lg remote");
	}
	
	@Override
	void on(){
		System.out.println("Running on mehtod of lg remote");
	}
	
	@Override
	void off(){
		System.out.println("RUnning off method of lg remote");
	}
}
	