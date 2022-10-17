class Shop 
{
	static void open ()
	{
		System.out.println("The shop opens at : 9.00am");
	}
	
	static void close (double timing)
	{
		System.out.println("The shop closes at :" +timing + "pm");
	}
	
	static void area (double length ,double breadth)
	{
		System.out.println(length);
		System.out.println(breadth);
	}
	
	static void selling (int noOfCmentBags ,int noOfBricks  ,int noOfTiles)
	{
		System.out.println(noOfCmentBags);
		System.out.println(noOfBricks);
		System.out.println(noOfTiles);
	}
	
	static void buying (String gstNo ,int labour  ,boolean  onlinePayment,int billNo)
	{
		System.out.println(gstNo);
		System.out.println(labour);
		System.out.println(onlinePayment);
		System.out.println(billNo);
	}
	
	static void details (String address ,String type  ,String owner,double profit ,float rating)
	{
		System.out.println(address);
		System.out.println(type);
		System.out.println(owner);
		System.out.println(profit);
		System.out.println(rating);
	}
	


}