class Biscuit
{
	String brand = "Britania" ;
	double price = 5;
	String expiryDate = "April 2023";
	double weight = 450;
	String manufacturedBy = "Britania" ;
	double quantity = 500;
	int noOfPieces = 12;
	
	Biscuit()
	{
		System.out.println("Have a crunch");
	}
	
	Biscuit(String brand)
	{
		this();
		this.brand = brand;
	}
	
	Biscuit(String brand,double price)
	{
		this(brand);
		this.price = price;
	}
	
	Biscuit(String brand,double price,String expiryDate )
	{
		this(brand, price);
		this.expiryDate = expiryDate;
	}
	
	Biscuit(String brand,double price,String expiryDate,double weight)
	{
		this(brand, price, expiryDate);
		this.weight = weight;
	}
	
	Biscuit(String brand,double price,String expiryDate,double weight, String manufacturedBy)
	{
		this(brand, price, expiryDate, weight);
		this.manufacturedBy = manufacturedBy;
	}
	
	Biscuit(String brand,double price,String expiryDate,double weight, String manufacturedBy, double quantity)
	{
		this(brand, price, expiryDate, weight, manufacturedBy);
		this.quantity = quantity;
	}
	
	Biscuit(String brand,double price,String expiryDate,double weight, String manufacturedBy, double quantity, int noOfPieces)
	{
		this(brand, price, expiryDate, weight, manufacturedBy, quantity);
		this.noOfPieces = noOfPieces;
	}
	
	
	
}