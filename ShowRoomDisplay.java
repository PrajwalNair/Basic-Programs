class ShowroomDisplay
{
	public static void main (String [] args)
	{
		Showroom showroom = new Showroom();
		System.out.println(Showroom.name);
		Showroom showroom1 = new Showroom("Hubli");
		System.out.println(showroom1.location);
		System.out.println(showroom.noOfItems);
		System.out.println(showroom.priceOfshoe);
		System.out.println(showroom.rating);
		
		Showroom showroom2 = new Showroom();
		showroom2.noOfItems = 20;
		showroom2.priceOfshoe = 2500;
		showroom2.rating = 4.5f;
		Showroom showroom3 = new Showroom("Bangalore");
		System.out.println(showroom3.location);
		System.out.println(showroom2.noOfItems);
		System.out.println(showroom2.priceOfshoe);
		System.out.println(showroom2.rating);
		
		Showroom showroom4 = new Showroom("Mangalore");
		showroom4.noOfItems = 25;
		showroom4.priceOfshoe = 3000;
		showroom4.rating = 4.8f;
		System.out.println(showroom4.location);
		System.out.println(showroom4.noOfItems);
		System.out.println(showroom4.priceOfshoe);
		System.out.println(showroom4.rating);
		
		
	}
	
}