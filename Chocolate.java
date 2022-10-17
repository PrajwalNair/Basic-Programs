class Chocolate
{
	String name ;
	String flavour ;
	String brand ;
	int price ;
	
	Chocolate()
	{
		System.out.println("welcome to the chocolaty world");
	}
	
	Chocolate(String name)
	{
		this();
		this.name = name;
	}
	
	Chocolate(String name, String flavour)
	{
		this(name);
		this.flavour = flavour ;
	}
	
	Chocolate(String name, String flavour, String brand)
	{
		this(name, flavour);
		this.brand = brand ;
	}
	
	Chocolate(String name, String flavour, String brand, int price)
	{
		this(name, flavour, brand);
		this.price = price ;
	}
	
}