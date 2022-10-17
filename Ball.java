class Ball
{
	static String brand = "kukaboora";
	static String material ;
	static String type;
	static double price ;
	
	static 
	{
		material = "leather";
		
	}
	
	static void setType()
	{
		type = "leather ball";
		System.out.println(type);
		
	}
	
	static void setType(String usedFor)
	{
		
		System.out.println(usedFor);
		
	}



}