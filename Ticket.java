class Ticket 
{
	static String ticketAvailable(int tickets)
	{
		if( tickets > 2)
		{
			System.out.println("NA");
			return "NA";
		}
		
		if( tickets < 2 && tickets>0)
		{
			System.out.println("AVAIL");
			
			return "AVAIL";
		}
		
		if( tickets < 0)
		{
			System.out.println("INVALID");
			return "INVALID";
		}
		return "";
	}


}