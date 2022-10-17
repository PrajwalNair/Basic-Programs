class Date
{
	int day ;
	int month ;
	int year ;
	String day1 ;
	
	Date ()
	{
		System.out.println("The default date");
	}
	
	Date (int day)
	{
		this();
		this.day = day;
	}
	
	Date (int day, int month)
	{
		this(day);
		this.month = month;
	}
	
	Date (int day, int month, int year)
	{
		this(day ,month);
		this.year = year;
	}
	
	Date (int day, int month, int year, String day1)
	{
		this(day,month,year);
		this.day1 = day1;
	}
	
}