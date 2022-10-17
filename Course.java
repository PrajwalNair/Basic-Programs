class Course
{
	static void title ()
	{
		System.out.println("SAP");
	}
	
	static void studentDetails (int noOfStudents)
	{
		System.out.println(noOfStudents);
	}
	
	static void studing (boolean offline, boolean online)
	{
		System.out.println(offline);
		System.out.println(online);
	}
	
	static void jobOpportunities (int noOfCompanies, String qualifiacation,int noOfVacancies)
	{
		System.out.println(noOfCompanies);
		System.out.println(qualifiacation);
		System.out.println(noOfVacancies);
	}
	
	static void properties (String type, int duration,int fees,double rating)
	{
		System.out.println(type);
		System.out.println(duration);
		System.out.println(fees);
		System.out.println(rating);
	}
	
	static void trainer (String name, String topic, int noOfTrainers, int trainerSalary, int age )
	{
		System.out.println(name);
		System.out.println(topic);
		System.out.println(noOfTrainers);
		System.out.println(trainerSalary);
		System.out.println(age);
	}


}