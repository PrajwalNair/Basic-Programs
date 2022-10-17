class ItemsDisplay
{
	public static void main(String [] values)
	{
		
		double result  = Vegetables.getPriceOfVegetable("Goose fruit");
		System.out.println(result);
		
		String resultOfVegetables = Vegetables.getVegetableByPrice (40);
		System.out.println(resultOfVegetables);
		
		String info = Chappal.getChappal(840, "36 months");
		System.out.println(info);
		
		double resultOfChappalPrice = Chappal.getprice("Nike", "6 months");
		System.out.println(resultOfChappalPrice);
		
		String value = LaptopNew.getLaptop(34847, "C330");
		System.out.println(value);
		
		double valueOfLaptop = LaptopNew.getLaptopPrice( "HP", "15-ec2004AX/A");
		System.out.println(valueOfLaptop);
		
		double resultOfFruitPrice  = Fruit.getPriceOfFruit("Apple");
		System.out.println(resultOfFruitPrice);
		
		double resultOfMobilePrice  = Mobile.getPriceOfMobile("Vivo T1 Pro");
		System.out.println(resultOfMobilePrice);
		
		String getMobileByPrice  = Mobile.getPriceOfMobile("Vivo T1 Pro");
		System.out.println(getMobileByPrice);
		
		
		
	}
	
	
	
}
