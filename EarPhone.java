class EarPhone
{
	static boolean bluetooth = true;
	static boolean noiseCancellation;
	static boolean neckband ;
	static boolean sensor ;
	
	static 
	{
		noiseCancellation = true ;
		
	}
	
	static void setNeckband()
	{
		neckband = true ;
		System.out.println(neckband);
	}
	
	static void setNeckband(boolean available)
	{
		
		System.out.println(available);
	}



}