public class WatchRun{
	public static void main(String[] args){
		
		WatchApp app = new WatchApp();
		
		
		Watch wat = new Watch("FastTrack","Sports","12:00",true,WatchType.DIGITAL);
		Watch wat1 = new Watch("Titan","Casual","12:00",false,WatchType.ANALOG);
		
		
		Watch wat2 = new Watch("","","0",false,WatchType.DIGITAL);
		
		app.saveWatch(wat);
		
		app.saveWatch(wat2);
		
	Watch[] returnedValues = app.returnValue();	
	
		for(int i=0;i<returnedValues.length;i++){
			if(returnedValues[i]!=null)
			returnedValues[i].printValues();
		
	}
	

		
	}
}