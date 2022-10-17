class NewActivity
{
	public static void main (String [] args)
	{
		Laptop.model ("Inspiron 3000 series");
		Laptop.price (45500.0D);
		Laptop.companyAndMadeIn ("Dell","China");
		String[] g = {"Books","Laptop","WaterBottle"};		
		Bag.carryItems(g);
		Bag.capacity (30.01D);
		Bag.properties ("Black", 2.2D, "College", "WildCraft");
		Humans.eat ("Breakfast", 8.30);
		Humans.sleep (6.00D, 10.00D);
		Humans.burnCalories ();
		Humans.run (2.5D);
		
	}


}