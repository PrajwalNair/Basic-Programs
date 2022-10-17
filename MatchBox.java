class MatchBox
{
	static int noOfMatchSticks = 20;
	static String shape ;
	static double price ;
	static String purpose ;
	
	static 
	{
		shape = "Rectangle";
	}
	
	static void setPrice()
	{
		price = 2;
		System.out.println(price);
		
	}
	static void setPrice(double mrp)
	{
		
		System.out.println(mrp);
		
	}


}