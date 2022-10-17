class NewsPaper
{
	static void display ()
	{
		System.out.println("Deccan Herald");
	}
	
	static void reading (int noOfHeadlines)
	{
		System.out.println(noOfHeadlines);
	}
	
	static void info (String language, int price)
	{
		System.out.println(language);
		System.out.println(price);
	}
	
	static void politics (String party, String  candidate, String minister)
	{
		System.out.println(party);
		System.out.println(candidate);
		System.out.println(minister);
	}
	
	static void sports (String cricket, int noOfPlayers, boolean pointsTable,String manOfTheMatch)
	{
		System.out.println(cricket);
		System.out.println(noOfPlayers);
		System.out.println(pointsTable);
		System.out.println(manOfTheMatch);
	}
	
	static void advertisement (int noOfJobVacancy, String homeAppliances, String modelNames, String films,int images)
	{
		System.out.println(noOfJobVacancy);
		System.out.println(homeAppliances);
		System.out.println(modelNames);
		System.out.println(films);
		System.out.println(images);
	}
	
}