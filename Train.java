class Train
{
	static int noOfBoggies = 10;
	static int noOfPassengers ;
	static int noOfCoaches ;
	static double noOfSeatsInOneBoggie ;
	
	
	static 
	{
		noOfPassengers = 30;
	}
	
	static void setNoOfCoaches()
	{
		noOfCoaches = 8;
		System.out.println(noOfCoaches);
	}
	
	static void setNoOfCoaches(int boggie)
	{
		System.out.println(boggie);
	}
	

}