public class Palindrome{
	public static void main(String[] args){
		String str = "madam";
		String rev="";
		
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--){
		 rev=rev+str.charAt(i);
		}
		
		 
		if(str.equals(rev)){
			System.out.println(str + " the string is palindrome");
		}
		else {
			System.out.println(str + " the string is not a palindrome");
		}
		
	}
}