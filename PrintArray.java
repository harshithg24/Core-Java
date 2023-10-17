public class PrintArray{
	public static void main(String[] args){
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		int middle = array.length/2;
		
		System.out.println("Print the values from middle"); 
	
		for(int i=middle;i<array.length;i++){
			
			System.out.println(array[i]+" ");
		}
		
		System.out.println("Print reverse skipping one value");
		for(int j=array.length-2;j>=0;j-=2){
			
			System.out.println(array[j]+" ");
		}
		
		System.out.println("Print even values");
		for(int k=0;k<array.length;k++){
			if(array[k] % 2 == 0)
			System.out.println(array[k]+" ");
		}
	}
}