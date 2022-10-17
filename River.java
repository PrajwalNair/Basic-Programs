class River
{
	static void flowing (int noOfRivers)
	{
		System.out.println(noOfRivers);
	}
	
	static void flowing (String famousRiver)
	{
		System.out.println(famousRiver);
	}
	
	static void flowing (String longestRiver,String shortestRiver)
	{
		System.out.println(longestRiver);
		System.out.println(shortestRiver);
	}
	
	static void flowing (double lengthOfTheRiver)
	{
		System.out.println(lengthOfTheRiver);
		
	}
	static void flowing (String [] namesOfRiver)
	{
		for (int v = 0; v<namesOfRiver.length; v++)
		{
		System.out.println(namesOfRiver[v]);
		}
		
	}

}