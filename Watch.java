class Watch
{
	static void set ()
	{
		System.out.println("Start");
		
		setAlarm ();
		setTime ();
		
		String brand = "Titan";
		String type = "Digital";
		String color = "Black";
		int price = 10000;
		
		System.out.println("The brand of the watch is : "+brand);
		System.out.println("Watch type : "+type);
		System.out.println("Color of the watch is : "+color);
		System.out.println("the price of the watch is : "+price);
		
		
	}

	static void setAlarm ()
	{
		System.out.println("Set the alarm");
		
	}
	static void setTime ()
	{
		System.out.println("Set the time for the alarm");
		
	}
}