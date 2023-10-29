public class WatchApp{
	 
	 Watch[] watch = new Watch[5];
	 
	 boolean saveWatch(Watch watchs){
		 
		 boolean validWatch = validateWatch(watchs);
		 if(validWatch){
			 for(int i=0;i<watch.length;i++){
				 if(watch[i]==null){
					 watch[i]=watchs;
					 System.out.println("Successfully saved!");
					 return true;
				    }
				 else{
					 System.out.println("Index is not empty, so it is not saved");
			 }
		 }
		 System.out.println("Index has no space");
		 return false;	 
	 }
	 return false;
	 }
	 
	 boolean validateWatch(Watch watchs){
		 if(watchs!=null){
			 System.out.println("Watch is Not null");
			 if(watchs.getBrand()!=null && watchs.getBrand().length()>3){
				  if(watchs.getModel()!=null && watchs.getModel().length()>3){
					  if(watchs.getTime()!=null && watchs.getTime().length()<6){
						  return true;
					  }
					  else{
						  System.out.println("Time is not valid");
						  return false;
					  }
				  }
				  else{
					  System.out.println("Watch model is not valid");
					  return false;
				  }
			 }
			 else{
				  System.out.println("brand is not valid");
				 return false;
			 }
			
		 }
		 else{
			  System.out.println("Watch is null");
			 return false;
		 }
	 }
	 
	 Watch[] returnValue(){
		
		 return this.watch;
	 }
	 
	 boolean checkIfExist(Watch watchs){
		 if(watchs!=null){
			 
			 for(int i = 0 ; i <watch.length; i++){
			 
			 if(watch[i].getBrand().equals(watchs.getBrand())){
				 return true;
				 
			 }
			 else{
				 return false;
				 
			 }
			 
			}
			 
		 }
		 return false;
	 }
	 
	 
}