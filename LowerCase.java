class LowerCase
{
	public static void main (String [] args)
	{
		char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int size = letters.length;
		
		System.out.println("Total number of letters = "+size);
		
		for (int a=0; a<letters.length; a++) //forward direction
		{
			System.out.println("Name of the letter is : "+letters[a]);
		}
		
			System.out.println("-----------------------");
		
		for (int a=letters.length-1; a>=0; a--) //backward direction
		{
			System.out.println("Name of the letter is : "+letters[a]);
		}
	}

}