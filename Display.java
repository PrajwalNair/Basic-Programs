class Display
{
	public static void main(String [] args)
	{
		Cricket.team (11,"England");
		Cricket.team (246, 192);
		Cricket.batting (246, "Long Drive" ,"Rohit Sharma");
		Cricket.batting ("Shikher Dhawan" ,130);
		String [] a = {"Bhuvi","Bhumrah","Chahal","Pandya"};
		Cricket.bowlers (a);
		Cricket.bowlers ("Jasprith Bhumrah");
		
		System.out.println(".........................");
		
		Radio.medium (10);
		Radio.medium ("Radio Mirchi");
		String [] b = {"Radio city","Big FM","Radio mirchi","Radio one"};
		Radio.medium (b);
		Radio.components ("Antena", 5000);
		Radio.components (15);
		Radio.components ( 92.7);
		
		System.out.println(".........................");
		
		SweetHome.construction(10);
		SweetHome.construction("shri krishna");
		String [] c = {"cement","sand","water","bricks","steel"};
		SweetHome.construction(c);
		SweetHome.construction(50000);
		SweetHome.concreting(9.8);
		SweetHome.concreting(5);
		
		System.out.println(".........................");
		
		Station.details (2);
		Station.details (25);
		String [] names = {"Ticket Counter","Enquiry"};
		Station.details (names);
		Station.details ( "Hosur" , 4);
		Station.details ( 9551518424L);
		Station.details (" KA 63 D4151");
		
		System.out.println(".........................");
		
		Temple.pooja ("Satyanarayana pooja");
		Temple.pooja (5000);
		Temple.pooja (9551544511L);
		Temple.pooja (9.30);
		Temple.pooja ("ganapati temple", "9.30 to 12.00");
		Temple.pooja ("vikas nagar", 580021);
		
		System.out.println(".........................");
		
		Stadium.game (1500);
		Stadium.game ("Hubli");
		Stadium.game ("indoor stadium", "Nehru Stadium");
		Stadium.game (true, 8);
		Stadium.game (false);
		Stadium.game (10);
		
		System.out.println(".........................");
		
		Mall.shopping ("Urban oasis mall");
		Mall.shopping (15);
		Mall.shopping (true);
		Mall.shopping (10.00);
		Mall.shopping (8415445554l);
		Mall.shopping (4.8f);
		
		System.out.println(".........................");
		
		Pub.event (10);
		Pub.event ("beer");
		Pub.event (true);
		Pub.event (1000);
		Pub.event ("hubli","ice cubes");
		Pub.event (4.9f);
		
		System.out.println(".........................");
		
		River.flowing (7);
		River.flowing ("godavari");
		River.flowing ("krishna","vrishabawathi");
		River.flowing (1.4);
		String [] v = {"Krishna","kaveri","godavari"};
		River.flowing (v);
		
		System.out.println(".........................");
		
		Park.playing (true);
		Park.playing ("MG Park");
		Park.playing (20);
		Park.playing (4.8f);
		Park.playing (12);
		Park.playing (8451545464l);
		
		System.out.println(".........................");
		
		Gym.workOut ("Spartan");
		Gym.workOut ('M');
		Gym.workOut (true);
		Gym.workOut (30);
		Gym.workOut (4.9f);
		Gym.workOut (1000);
		
		System.out.println(".........................");

	}


}