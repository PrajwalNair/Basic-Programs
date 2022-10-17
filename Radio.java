class Radio 
{
	static void medium (int noOfStation)
	{
		System.out.println("Number of Station  :"+noOfStation);
	}
	
	static void medium (String nameOfStation)
	{
		System.out.println("Number of Station  :"+nameOfStation);
	}
	
	static void medium (String [] names)
	{
		for (int a = 0; a<names.length; a++)
		{
		System.out.println("Number of Station  :"+names[a]);
		}
	}
	
	static void  components (String nameOfThePart, int price)
	{
		System.out.println("Name of the part is "+nameOfThePart);
		System.out.println("Name of the part is "+price);
	}
	
	static void  components (int numberOfParts)
	{
		System.out.println("Name of the part is "+numberOfParts);
	}
	
	static void  components ( double stationNo)
	{
		System.out.println(stationNo);
	}
	
	


}