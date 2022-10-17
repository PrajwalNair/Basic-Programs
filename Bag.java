class Bag
{
	static void carryItems (String[] items)
	{
		
		for(int i=0;i<items.length;i++)
		{
		
		System.out.println("Bag can carry items like : "+items[i]);
		}
		
	}
	
	static void capacity (double litres)
	{
		
		System.out.println("Capacity of the bag : "+litres);
		
	}
	
	static void properties (String color, double weight, String type, String brand)
	{
		
		System.out.println("Color : "+color);
		System.out.println("Weight : "+weight);
		System.out.println("type : "+type);
		System.out.println("brand : "+brand);
		
		capacity (30.00D);
	}



}