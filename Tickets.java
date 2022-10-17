class Ticket 
{
	static String ticketAvailable(int tickets)
	{
		if(int tickets > 2)
		{
			System.out.println("NA");
			return "NA";
		}
		
		if(int tickets <2)
		{
			System.out.println("AVAIL");
			
			return "AVAIL";
		}
		
		if(int tickets < 0)
		{
			System.out.println("INVALID");
			return "INVALID";
		}
		
	}


}