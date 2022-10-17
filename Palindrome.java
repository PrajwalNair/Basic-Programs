class Palindrome{
	public static void main(String [] args){
		String str ="Gadag"; 
		String reverseStr = "";
		int strlength = str.length();
		for(int i=(strlength-1);i>=0; i--){
			reverseStr = reverseStr+str.charAt();
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase())){
			System.out.println(str+" is a palindrome");
		}else{
			System.out.println(str+" is not a palindrome");
		}
		
		
		
	}
}