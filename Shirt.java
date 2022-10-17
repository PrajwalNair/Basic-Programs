class Shirt
{
	static String pattern ;
	static boolean chineseCollar ;
	static float rating ;
	static String material ;
	
	static 
	{
		chineseCollar = true;
	}
	
	static void setRating()
	{
		rating = 4.6f;
		System.out.println(rating);
	}
	
	static void setRating(double review)
	{
		
		System.out.println(review);
	}
	

}