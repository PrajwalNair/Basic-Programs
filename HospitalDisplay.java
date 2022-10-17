class HospitalDisplay
{
	public static void main (String [] args)
	{
	
	String name = Hospital.name; 
	System.out.println(name);
	String location = Hospital.location; 
	System.out.println(location);
	String type = Hospital.type; 
	System.out.println(type);
	int noOfStaff = Hospital.noOfStaff; 
	System.out.println(noOfStaff);
	int noOflab = Hospital.noOflab; 
	System.out.println(noOflab);
	int noOfSurgeon = Hospital.noOfSurgeon; 
	System.out.println(noOfSurgeon);
	double profit = Hospital.profit; 
	System.out.println(profit);
	float rating = Hospital.rating; 
	System.out.println(rating);
	int noOfgeneralWards = Hospital.noOfgeneralWards; 
	System.out.println(noOfgeneralWards);
	double priceOfECG = Hospital.priceOfECG; 
	System.out.println(priceOfECG);
	boolean ctScan = Hospital.ctScan; 
	System.out.println(ctScan);
	int noOfbeds = Hospital.noOfbeds; 
	System.out.println(noOfbeds);
	int noOfOperationTheatres = Hospital.noOfOperationTheatres; 
	System.out.println(noOfOperationTheatres);
	
	
	System.out.println("................");
	//reassigning the values
	
	Hospital.name = "SDM";
	Hospital.location = "Sattur";
	Hospital.type = "Multispeciality";
	Hospital.noOfStaff = 60;
	Hospital.noOflab = 4;
	Hospital.noOfSurgeon = 10;
	Hospital.profit = 500000;
	Hospital.rating = 4.9f;
	Hospital.noOfgeneralWards = 8;
	Hospital.priceOfECG = 1000;
	Hospital.ctScan = true;
	Hospital.noOfbeds = 20;
	Hospital.noOfOperationTheatres = 5;
	
	System.out.println(Hospital.name);
	System.out.println(Hospital.location);
	System.out.println(Hospital.type);
	System.out.println(Hospital.noOfStaff);
	System.out.println(Hospital.noOflab);
	System.out.println(Hospital.noOfSurgeon);
	System.out.println(Hospital.profit);
	System.out.println(Hospital.rating);
	System.out.println(Hospital.noOfgeneralWards);
	System.out.println(Hospital.priceOfECG);
	System.out.println(Hospital.ctScan);
	System.out.println(Hospital.noOfbeds);
	System.out.println(Hospital.noOfOperationTheatres);
	}

}