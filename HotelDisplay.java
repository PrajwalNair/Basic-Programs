class HotelDisplay
{
	public static void main (String [] args)
	{
		String name = Hotel.name;
		System.out.println(name);
		String location = Hotel.location;
		System.out.println(location);
		String type = Hotel.type;
		System.out.println(type);
		double openTime = Hotel.openTime;
		System.out.println(openTime);
		double closeTime = Hotel.closeTime;
		System.out.println(closeTime);
		int noOfFoods = Hotel.noOfFoods;
		System.out.println(noOfFoods);
		int noOfChef = Hotel.noOfChef;
		System.out.println(noOfChef);
		int noOfWaiters = Hotel.noOfWaiters;
		System.out.println(noOfWaiters);
		double rentOfHotel = Hotel.rentOfHotel;
		System.out.println(rentOfHotel);
		boolean nonVeg = Hotel.nonVeg;
		System.out.println(nonVeg);
		double rating = Hotel.rating;
		System.out.println(rating);
		double profit = Hotel.profit;
		System.out.println(profit);
		String famousFood = Hotel.famousFood;
		System.out.println(famousFood);
		
		
		
		System.out.println("................");
	//reassigning the values
	
		Hotel.name = "Canara";
		Hotel.location = "Hosur";
		Hotel.type = "Veg";
		Hotel.openTime = 6.00;
		Hotel.closeTime = 10.30;
		Hotel.noOfFoods = 15;
		Hotel.noOfChef = 4;
		Hotel.noOfWaiters = 10;
		Hotel.rentOfHotel = 35000;
		Hotel.nonVeg = false;
		Hotel.rating = 4.95f;
		Hotel.profit = 100000;
		Hotel.famousFood = "Puri";
		
		
		System.out.println(Hotel.name);
		System.out.println(Hotel.location);
		System.out.println(Hotel.type);
		System.out.println(Hotel.openTime);
		System.out.println(Hotel.closeTime);
		System.out.println(Hotel.noOfFoods);
		System.out.println(Hotel.noOfChef);
		System.out.println(Hotel.noOfWaiters);
		System.out.println(Hotel.rentOfHotel);
		System.out.println(Hotel.nonVeg);
		System.out.println(Hotel.rating);
		System.out.println(Hotel.profit);
		System.out.println(Hotel.profit);
		
	}


}