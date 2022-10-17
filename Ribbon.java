class Ribbon
{
	static double length = 10;
	static double width ;
	static String color ;
	static String material ;
	
	static 
	{
		width = 1;

	}
	
	static void setColor()
	{
		color = "yellow";
		System.out.println(color);

	}
	
	
	static void setColor(String paint)
	{
		
		System.out.println(paint);

	}

}