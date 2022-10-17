class PubDisplay
{
	public static void main(String [] args)
	{
		Pub pub = new Pub ();
		System.out.println(Pub.alcohol);
		System.out.println(pub.name);
		System.out.println(pub.place);
		Pub pub1 = new Pub (4.8);
		System.out.println(pub1.rating);
		System.out.println(pub1.profit);
		
		
		Pub pub2 = new Pub (4.5);
		pub2.name = "Ice cubes";
		pub2.place = "Hubli";
		pub2.profit = "10%";
		System.out.println(pub2.name);
		System.out.println(pub2.place);
		System.out.println(pub2.rating);
		System.out.println(pub2.profit);
		
		
		Pub pub3 = new Pub (4.8);
		pub3.name = "Dennisons";
		pub3.place = "Hubli";
		pub3.profit = "15%";
		System.out.println(pub3.name);
		System.out.println(pub3.place);
		System.out.println(pub3.rating);
		System.out.println(pub3.profit);
		
		
		Pub pub4 = new Pub (4.9);
		pub4.name = "Neptune";
		pub4.place = "Hubli";
		pub4.profit = "12%";
		System.out.println(pub4.name);
		System.out.println(pub4.place);
		System.out.println(pub4.rating);
		System.out.println(pub4.profit);
		
		
	}
}