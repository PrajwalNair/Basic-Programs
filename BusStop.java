class BusStop
{
	String stopName;
	String startingPoint;
	String endPoint;
	int totalBenches;
	String [] passengerNames;
	double [] timeOfArrival;
	
	void setInfo(String stopName, String startingPoint, String endPoint)
	{
		this.stopName = stopName;
		this.startingPoint = startingPoint;
		this.endPoint = endPoint ;
	}
	
	BusStop(int totalBenches, String [] passengerNames, double []timeOfArrival)
	{
		this.totalBenches = totalBenches;
		this.passengerNames = passengerNames;
		this.timeOfArrival = timeOfArrival;
	}
	
	void printData()
	{
		System.out.println(this.stopName);
		System.out.println(this.startingPoint);
		System.out.println(this.endPoint);
		System.out.println(this.totalBenches);
		for(int a=0; a<this.passengerNames.length; a++)
		{
			System.out.println(this.passengerNames[a]);
		}
		
		for(int b=0; b<this.passengerNames.length; b++)
		{
			System.out.println(this.timeOfArrival[b]);
		}
		
		
		
	}
	
	
}