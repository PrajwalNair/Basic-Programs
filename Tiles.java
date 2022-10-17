class Tiles
{
	static String size = "2*2";
	static String brand ;
	static int costPrice ;
	static String usedFor ;
	
	static 
	{
		brand = "Jhonson";
	}
	
	static void setCostPrice()
	{
		costPrice = 38;
		System.out.println(costPrice);
	}
	
	static void setCostPrice(int ratePerBox)
	{
		System.out.println(ratePerBox);
	}
	


}