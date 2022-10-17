class Humans
{
	static void eat (String item, double time)
	{
		System.out.println("The food item is :"+item);
		System.out.println("Time :"+time);
		
	}	
	
	
	static void sleep (double start, double end)
	{
		System.out.println("Morning waking time :"+start);
		System.out.println("Night sleeping time :"+end);
		
	}
	
	static void burnCalories ()
	{
		System.out.println("Excercise can burn the calories");
		run (2.5D);
	}
	
	static void run (double distance)
	{
		System.out.println("Running can burn the calories"+distance);
		
	}

}