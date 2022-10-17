class Hanger
{
	static String uses = "Hang the clothes";
	static String shape ;
	static double price ;
	static String material ;
	
	static 
	{
		shape = "Triangle";
	}
	
	static void setPrice()
	{
		price = 20;
		System.out.println(price);
	}
	
	static void setPrice(int cost)
	{
		
		System.out.println(cost);
	}

}