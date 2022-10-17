class Cement
{
	static String brand = "ACC";
	static String color ;
	static int gradeOfCement ;
	static double rate ;
	
	static 
	{
		color = "Grey";
		
	}
	
	static void setGradeOfCement ()
	{
		gradeOfCement = 43;
		System.out.println(gradeOfCement);
		
	}
	
	
	static void setGradeOfCement (int grade)
	{
		
		System.out.println(grade);
		
	}

}