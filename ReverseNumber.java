class ReverseNumber
{
	public static void main (String [] arrgs )
	{
		int i = 12545544,reverse = 0;
		
		
		while (i!=0)
		{
			int remainder = i%10;
			reverse = reverse*10+remainder;
			i = i/10;
			
			
		}
		System.out.println("The reverse of the given number is : "+reverse);
		
	}
}