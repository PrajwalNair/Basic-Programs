class BusStopDisplay
{
	public static void main (String [] values)
	{
		String [] names = {"Malthesh","Abhishek","Hanamant","Dharshan"};
		double [] arrival = {6.00,9.45,12.00,2.35,5.55};
		BusStop busStop = new BusStop (3,names, arrival);
		busStop.setInfo("Banashankari","Janatha Bazar","Mico Layout");
		busStop.printData();
		
	}
}