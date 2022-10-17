class ClothDisplay
{
	public static void main(String [] args)
	{
		String type = Cloth.type ;
		System.out.println(type);
		String color = Cloth.color ;
		System.out.println(color);
		String brand = Cloth.brand ;
		System.out.println(brand);
		String typeOfCollar = Cloth.typeOfCollar ;
		System.out.println(typeOfCollar);
		char gender = Cloth.gender ;
		System.out.println(gender);
		double priceOfCloth = Cloth.priceOfCloth ;
		System.out.println(priceOfCloth);
		double rating = Cloth.rating ;
		System.out.println(rating);
		boolean men = Cloth.men ;
		System.out.println(men);
		String material = Cloth.material;
		System.out.println(material);
		String buttonColor = Cloth.buttonColor ;
		System.out.println(buttonColor);
		int noOfButtonsUsed = Cloth.noOfButtonsUsed;
		System.out.println(noOfButtonsUsed);
		double profit = Cloth.profit;
		System.out.println(profit);
		String availableIn =Cloth.availableIn ;
		System.out.println(availableIn);
		
		
		System.out.println("................");
	//reassigning the values
	
	
		Cloth.type = "Shirt" ;
		Cloth.color = "grey";
		Cloth.brand = "Van Hussuen";
		Cloth.typeOfCollar = "Chinese";
		Cloth.gender = 'M';
		Cloth.priceOfCloth = 1500;
		Cloth.rating = 4.9f;
		Cloth.men = true;
		Cloth.material = "Cotton";
		Cloth.buttonColor = "Black" ;
		Cloth.noOfButtonsUsed = 6;
		Cloth.profit = 250;
		Cloth.availableIn = "Online";
		
		
		
		System.out.println(Cloth.type);
		System.out.println(Cloth.color);
		System.out.println(Cloth.brand);
		System.out.println(Cloth.typeOfCollar);
		System.out.println(Cloth.gender);
		System.out.println(Cloth.priceOfCloth);
		System.out.println(Cloth.rating);
		System.out.println(Cloth.men);

		
		
		
		
	}




}