class Sweater
{
	static double price = 600;
	static String material;
	static double rating ;
	static boolean fullSleeve;
	
	static 
	{
		material = "Woolen";
	}
	
	static void setRating() 
	{
		rating = 4.8;
		System.out.println(rating);
	}
	
	static void setRating(double review) 
	{
		System.out.println(review);
	}


}