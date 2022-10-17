class SweetHome
{
	static void construction(int noOfMaterialsUsed)
	{
		System.out.println("Number of materials"+noOfMaterialsUsed);
	}
	
	static void construction(String nameOfHouse)
	{
		System.out.println("Number of materials"+nameOfHouse);
	}
	
	static void construction(String [] nameOfMaterials)
	{
		for (int i = 0; i<nameOfMaterials.length ; i++)
		{
		System.out.println("Number of materials"+nameOfMaterials[i]);
		}
	}
	
	static void construction(double priceOfDoor)
	{
		System.out.println("Number of materials"+priceOfDoor);
	}
	
	static void concreting(double cementRating)
	{
		System.out.println("Number of materials"+cementRating);
	}
	
	static void concreting(int noOfMaterialsUsed)
	{
		System.out.println("Number of materials"+noOfMaterialsUsed);
	}
	
	


}