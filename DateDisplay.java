class DateDisplay
{
	public static void main (String [] args)
	{
		Date date = new Date() ;
		System.out.println(date.day);
		System.out.println(date.month);
		System.out.println(date.year);
		System.out.println(date.day1);
		
		
		Date date1 = new Date(23) ;
		date1.month = 6;
		date1.year = 2022;
		date1.day1 = "Monday";
		System.out.println(date1.day);
		System.out.println(date1.month);
		System.out.println(date1.year);
		System.out.println(date1.day1);
		
		Date date2 = new Date(25,5) ;
		date2.year = 2022;
		date2.day1 = "Wednesday";
		System.out.println(date2.day);
		System.out.println(date2.month);
		System.out.println(date2.year);
		System.out.println(date2.day1);
		
		Date date3 = new Date(19,6,2022) ;
		date3.day1 = "Tuesday";
		System.out.println(date3.day);
		System.out.println(date3.month);
		System.out.println(date3.year);
		System.out.println(date3.day1);
		
		Date date4 = new Date(25,5,2022,"Thusrday") ;
		System.out.println(date4.day);
		System.out.println(date4.month);
		System.out.println(date4.year);
		System.out.println(date4.day1);
		
	}
}