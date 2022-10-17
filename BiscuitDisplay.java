class BiscuitDisplay
{
	public static void main (String [] args)
	{
		Biscuit biscuit = new Biscuit();
		biscuit.brand = "Hide and Seek";
		biscuit.price = 30;
		biscuit.expiryDate = "Dec 2022";
		biscuit.weight = 120;
		biscuit.manufacturedBy = "Parle";
		biscuit.quantity = 120;
		biscuit.noOfPieces = 22;
		System.out.println(biscuit.brand);
		System.out.println(biscuit.price);
		System.out.println(biscuit.expiryDate);
		System.out.println(biscuit.weight);
		System.out.println(biscuit.manufacturedBy);
		System.out.println(biscuit.quantity);
		System.out.println(biscuit.noOfPieces);
		
		Biscuit biscuit1 = new Biscuit("oreo");
		biscuit1.price =10 ;
		biscuit1.expiryDate = "jan 2023";
		biscuit1.weight = 100;
		biscuit1.manufacturedBy = "Cadbery";
		biscuit1.quantity = 100;
		biscuit1.noOfPieces = 5;
		System.out.println(biscuit1.brand);
		System.out.println(biscuit1.price);
		System.out.println(biscuit1.expiryDate);
		System.out.println(biscuit1.weight);
		System.out.println(biscuit1.manufacturedBy);
		System.out.println(biscuit1.quantity);
		System.out.println(biscuit1.noOfPieces);
		
		Biscuit biscuit2 = new Biscuit("Hide & Seek",15);
		biscuit2.expiryDate = "Dec 2023";
		biscuit2.weight = 125;
		biscuit2.manufacturedBy = "Good day";
		biscuit2.quantity = 150;
		biscuit2.noOfPieces = 12;
		System.out.println(biscuit2.brand);
		System.out.println(biscuit2.price);
		System.out.println(biscuit2.expiryDate);
		System.out.println(biscuit2.weight);
		System.out.println(biscuit2.manufacturedBy);
		System.out.println(biscuit2.quantity);
		System.out.println(biscuit2.noOfPieces);
		
		Biscuit biscuit3 = new Biscuit("Moms Magic",20,"March 2023");
		biscuit3.weight = 750;
		biscuit3.manufacturedBy = "Good day";
		biscuit3.quantity = 250;
		biscuit3.noOfPieces = 15;
		System.out.println(biscuit3.brand);
		System.out.println(biscuit3.price);
		System.out.println(biscuit3.expiryDate);
		System.out.println(biscuit3.weight);
		System.out.println(biscuit3.manufacturedBy);
		System.out.println(biscuit3.quantity);
		System.out.println(biscuit3.noOfPieces);
		
		Biscuit biscuit4 = new Biscuit("Parle G",5,"March 2023",450);
		biscuit4.manufacturedBy = "Good day";
		biscuit4.quantity = 250;
		biscuit4.noOfPieces = 15;
		System.out.println(biscuit4.brand);
		System.out.println(biscuit4.price);
		System.out.println(biscuit4.expiryDate);
		System.out.println(biscuit4.weight);
		System.out.println(biscuit4.manufacturedBy);
		System.out.println(biscuit4.quantity);
		System.out.println(biscuit4.noOfPieces);
		
		Biscuit biscuit5 = new Biscuit("Parle G",5,"March 2023",450,"Parle");
		biscuit5.quantity = 250;
		biscuit5.noOfPieces = 15;
		System.out.println(biscuit5.brand);
		System.out.println(biscuit5.price);
		System.out.println(biscuit5.expiryDate);
		System.out.println(biscuit5.weight);
		System.out.println(biscuit5.manufacturedBy);
		System.out.println(biscuit5.quantity);
		System.out.println(biscuit5.noOfPieces);
		
		Biscuit biscuit6 = new Biscuit("Parle G",5,"March 2023",450,"Parle",500);
		biscuit6.noOfPieces = 8;
		System.out.println(biscuit6.brand);
		System.out.println(biscuit6.price);
		System.out.println(biscuit6.expiryDate);
		System.out.println(biscuit6.weight);
		System.out.println(biscuit6.manufacturedBy);
		System.out.println(biscuit6.quantity);
		System.out.println(biscuit6.noOfPieces);
		
		Biscuit biscuit7 = new Biscuit("Parle G",5,"March 2023",450,"Parle",500,12);
		System.out.println(biscuit7.brand);
		System.out.println(biscuit7.price);
		System.out.println(biscuit7.expiryDate);
		System.out.println(biscuit7.weight);
		System.out.println(biscuit7.manufacturedBy);
		System.out.println(biscuit7.quantity);
		System.out.println(biscuit7.noOfPieces);
		
	}

}