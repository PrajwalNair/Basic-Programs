class MetroDisplay
{
	public static void main(String [] args)
	{
		Metro output = new Metro();
		System.out.println(output.openTime);
		System.out.println(output.closeTime);
		System.out.println(output.noOfStops);
		System.out.println(output.ticket);
		System.out.println(output.card);
		System.out.println(output.noOfBoggie);
		System.out.println(output.noOfSeats);
		System.out.println(output.noOfPassengers);
		
		
		output.openTime = "5.30";
		System.out.println(output.openTime);
		output.closeTime = "11.00";
		System.out.println(output.closeTime);
		output.noOfStops = 10;
		System.out.println(output.noOfStops);
		output.ticket = 25;
		System.out.println(output.ticket);
		output.card = true;
		System.out.println(output.card);
		output.noOfBoggie = 6;
		System.out.println(output.noOfBoggie);
		output.noOfSeats = 250;
		System.out.println(output.noOfSeats);
		output.noOfPassengers = 400;
		System.out.println(output.noOfPassengers);
		
		
		
	}



}