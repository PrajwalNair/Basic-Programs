class ReverseNo
{
	public static void main (String [] args)
	{
	int reverse = 0;
	
	for ( int a = 123456789; a!=0; a = a/10)
	{
		int remainder = a%10;
		reverse = reverse * 10 + remainder;
		
	}
	System.out.println("The reverse number is "+reverse);
	}
}