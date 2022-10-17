class Name
{
	static String getFullName(String firstName,String lastName)
	{
		String start = firstName ;
		String end = lastName ;
		String space = " " ;
		String startName = start+space+end ;
		System.out.println(startName);
		return startName;
		
	}

	static String getFullNameWithAbbrevation(String initialName,String finalName ,boolean male)
	{
		String space = " ";
		String fullName = initialName+space+finalName;
		//boolean gender= true;
		//male = gender ;
		if (male)
		{
			String abbrevation = "Mr.";
			String fName = abbrevation+fullName;
			System.out.println("The Name of the Candidate is ");
			System.out.println(fName);
			return fullName;
		}
		else
		{
			String abbrevation = "Ms.";
			String fName = abbrevation+fullName;
			System.out.println(fName);
			return fullName;
		}
		
		
		
	}

}