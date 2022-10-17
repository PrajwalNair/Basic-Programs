class IceCream
{
	String flavour;
    double price;
    String type;
    String color;
    String brand;
    double weight;
    double quantity;
    boolean dryFruit;
    boolean goodTaste;
    int since;
	
	IceCream()
	{
		System.out.println("The default value");
	}
	
	IceCream(String flavour)
	{
		this();
		this.flavour=flavour;
		//System.out.println("Passing 1 arguments");
	}
	
	IceCream(String flavour, double price)
	{
		this(flavour);
		this.price=price;
		//System.out.println("Passing 2 arguments");
	}
	
	IceCream(String flavour, double price, String type)
	{
		this(flavour ,price);
		this.type=type;
		//System.out.println("Passing 3 arguments");
	}
	
	
	IceCream(String flavour, double price, String type ,String color)
	{
		this(flavour ,price, type);
		this.color=color;
		//System.out.println("Passing 4 arguments");
	}
	
	IceCream(String flavour, double price, String type ,String color, String brand)
	{
		this(flavour ,price, type, color);
		this.brand=brand;
		//System.out.println("Passing 5 arguments");
	}
	
	IceCream(String flavour, double price, String type ,String color, String brand, double weight)
	{
		this(flavour ,price, type, color, brand);
		this.weight=weight;
		//System.out.println("Passing 6 arguments");
	}
	
	
	IceCream(String flavour, double price, String type ,String color, String brand, double weight, double quantity)
	{
		this(flavour ,price, type, color, brand, weight);
		this.quantity=quantity;
		//System.out.println("Passing 7 arguments");
	}
	
	
	IceCream(String flavour, double price, String type ,String color, String brand, double weight, double quantity, boolean dryFruit)
	{
		this(flavour ,price, type, color, brand, weight, quantity);
		this.dryFruit=dryFruit;
		//System.out.println("Passing 8 arguments");
	}
	
	IceCream(String flavour, double price, String type ,String color, String brand, double weight, double quantity, boolean dryFruit, boolean goodTaste)
	{
		this(flavour ,price, type, color, brand, weight, quantity, dryFruit);
		this.goodTaste=goodTaste;
		//System.out.println("Passing 9 arguments");
	}
	
	
	IceCream(String flavour, double price, String type ,String color, String brand, double weight, double quantity, boolean dryFruit, boolean goodTaste, int since )
	{
		this(flavour ,price, type, color, brand, weight, quantity, dryFruit, goodTaste);
		this.since=since;
		//System.out.println("Passing 10 arguments");
	}
	
	
}