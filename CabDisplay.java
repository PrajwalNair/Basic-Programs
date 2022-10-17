class CabDisplay
{
	public static void main (String [] args)
	{
		boolean online = Cab.online ;
		System.out.println(online);
		String typeOfVehicle =Cab.typeOfVehicle ;
		System.out.println(typeOfVehicle);
		char driver = Cab.driver ;
		System.out.println(driver);
		String nameOfTheApp = Cab.nameOfTheApp;
		System.out.println(nameOfTheApp);
		double price = Cab.price ;
		System.out.println(price);
		double rating = Cab.rating ;
		System.out.println(rating);
		int NoOfSeats = Cab.NoOfSeats ;
		System.out.println(NoOfSeats);
		String source = Cab.source ;
		System.out.println(source);
		String destination = Cab.destination ;
		System.out.println(destination);
		String colorOfVehicle = Cab.colorOfVehicle ;
		System.out.println(colorOfVehicle);
		String nameOfDriver = Cab.nameOfDriver ;
		System.out.println(nameOfDriver);
		String paymentType = Cab.paymentType ;
		System.out.println(paymentType) ;
		String paymentApp = Cab.paymentApp ;
		System.out.println(paymentApp);
		
		
		
		System.out.println ("....................");
		//Reassigning the values 
		
		
		Cab.online = true ;
		Cab.typeOfVehicle = "car" ;
		Cab.driver = 'M';
		Cab.nameOfTheApp = "ola";
		Cab.price = 100;
		Cab.rating = 4.5;
		Cab.NoOfSeats = 1 ;
		Cab.source = "BTM";
		Cab.destination = "Basavanagudi";
		Cab.colorOfVehicle = "White";
		Cab.nameOfDriver = "Harish";
		Cab.paymentType = "Online" ;
		Cab.paymentApp = "Phonepe";
		
		
		
		System.out.println(Cab.online );
		System.out.println(Cab.typeOfVehicle );
		System.out.println(Cab.driver );
		System.out.println(Cab.nameOfTheApp);
		System.out.println(Cab.price);
		System.out.println(Cab.rating);
		System.out.println(Cab.NoOfSeats );
		System.out.println(Cab.source);
		System.out.println(Cab.destination );
		System.out.println(Cab.colorOfVehicle );
		System.out.println(Cab.nameOfDriver);
		System.out.println(Cab.paymentType );
		System.out.println(Cab.paymentApp);
		
		
		
		
		
		
	}



}