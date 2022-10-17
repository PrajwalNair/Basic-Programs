class ChocolateDisplay
{
	public static void main (String [] args)
	{
		Chocolate chocolate = new Chocolate();
		chocolate.name = "Mango bite";
		chocolate.flavour = "mango";
		chocolate.brand = "Parle";
		chocolate.price = 1 ;
		System.out.println(chocolate.name);
		System.out.println(chocolate.flavour);
		System.out.println(chocolate.brand);
		System.out.println(chocolate.price);
		
		Chocolate chocolate1 = new Chocolate("Milkybar");
		chocolate1.flavour = "milky";
		chocolate1.brand = "Nestle";
		chocolate1.price = 20 ;
		System.out.println(chocolate1.name);
		System.out.println(chocolate1.flavour);
		System.out.println(chocolate1.brand);
		System.out.println(chocolate1.price);
		
		Chocolate chocolate2 = new Chocolate("Diary milk nuts", "Chocolaty");
		chocolate2.brand = "Diary milk";
		chocolate2.price = 100 ;
		System.out.println(chocolate2.name);
		System.out.println(chocolate2.flavour);
		System.out.println(chocolate2.brand);
		System.out.println(chocolate2.price);
		
		Chocolate chocolate3 = new Chocolate("Diary milk silk", "Chocolaty and nuts","Diary milk");
		chocolate3.price = 50;
		System.out.println(chocolate3.name);
		System.out.println(chocolate3.flavour);
		System.out.println(chocolate3.brand);
		System.out.println(chocolate3.price);
		
		Chocolate chocolate4 = new Chocolate("Diary milk silk", "Chocolaty and nuts","Diary milk",75);
		System.out.println(chocolate4.name);
		System.out.println(chocolate4.flavour);
		System.out.println(chocolate4.brand);
		System.out.println(chocolate4.price);
		
		
		
		
	}
}