class Plate
{
	static double price = 60;
	static String color ;
	static String type ;
	static float rating ;
	
	
	static 
	{
		color = "White";
		
	}
	
	static void setType()
	{
		type = "Fiber";
	}
	
	static void setType(String material)
	{
		System.out.println(material);
	}


}