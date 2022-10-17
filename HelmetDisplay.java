class HelmetDisplay
{
	public static void main (String [] args )
	{
		String color = Helmet.color ;
		System.out.println(color);
		String type = Helmet.type ;
		System.out.println(type);
		double price = Helmet.price ;
		System.out.println(price);
		boolean isiMark = Helmet.isiMark ;
		System.out.println(isiMark);
		String material = Helmet.material ;
		System.out.println(material);
		String brand = Helmet.brand ;
		System.out.println(material);
		double rating = Helmet.rating ;
		System.out.println(rating);
		String typeOfEdition = Helmet.typeOfEdition ;
		System.out.println(typeOfEdition);
		String purpose = Helmet.purpose ;
		System.out.println(purpose);
		boolean reflectiveShield = Helmet.reflectiveShield;
		System.out.println(reflectiveShield);
		boolean quickReleaseBuckles = Helmet.quickReleaseBuckles;
		System.out.println(quickReleaseBuckles);
		boolean breathDeflector = Helmet.breathDeflector;
		System.out.println(breathDeflector);
		boolean helmetCamera = Helmet.helmetCamera;
		System.out.println(helmetCamera);
		
		System.out.println("........................");
		//Reassigning the values
		
		Helmet.color = "Black" ;
		Helmet.type = "Full";
		Helmet.price = 900 ;
		Helmet.isiMark = true;
		Helmet.material = "Fiber";
		Helmet.brand = "Vega";
		Helmet.rating = 4.8;
		Helmet.purpose = "Safety";
		Helmet.reflectiveShield = true;
		Helmet.quickReleaseBuckles = true;
		Helmet.breathDeflector = true;
		Helmet.helmetCamera = false;
		
		
		System.out.println(Helmet.color);
		System.out.println(Helmet.type);
		System.out.println(Helmet.price);
		System.out.println(Helmet.isiMark);
		System.out.println(Helmet.material);
		System.out.println(Helmet.brand);
		System.out.println(Helmet.rating);
		System.out.println(Helmet.purpose);
		System.out.println(Helmet.reflectiveShield);
		System.out.println(Helmet.quickReleaseBuckles);
		System.out.println(Helmet.breathDeflector);
		System.out.println(Helmet.helmetCamera);
		
	}


}