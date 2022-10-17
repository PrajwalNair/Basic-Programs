class Bat
{
	static String brand = "Mangoose";
	static double length ;
	static boolean handleGrip ;
	static double price ;
	
	static 
	{
		length = 38;
	
	}
	
	static void setHandleGrip()
	{
		handleGrip = true;
		System.out.println(handleGrip);
	
	}
	
	
	static void setHandleGrip(boolean available)
	{
		
		System.out.println(available);
	
	}

}