class Concrete
{
	static String gradeOfConcrete = "M25";
	static String ratio ;
	static boolean admixture ;
	static String cementUsed;
	
	
	static 
	{
		ratio = "1:1:2";
		
	}
	
	static void setAdmixture()
	{
		admixture = true;
		System.out.println(admixture);
	}
	
	static void setAdmixture(double rate)
	{
		
		System.out.println(rate);
	}
	
	

}