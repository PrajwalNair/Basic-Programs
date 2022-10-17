class Ship
{
	static int capacity = 100 ;
	static double speed ;
	static String color ;
	static char captain ;
	
	
	static 
	{
		speed = 100;
	}
	
	static void setColor()
	{
		color = "White";
		System.out.println(color);
	}
	
	static void setColor(String paint)
	{
		
		System.out.println(paint);
	}




}