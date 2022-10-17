class Steel
{
	static int yeildStrength = 550 ;
	static boolean usedForTensionReinforcement ;
	static int diaOfBar ;
	static int gradeOfSteel ;
	
	static 
	{
		usedForTensionReinforcement = true ;
	}
	
	static void setDiaOfBar()
	{
		diaOfBar = 12 ;
		System.out.println(diaOfBar);
	}
	
	static void setDiaOfBar(int slab)
	{
		System.out.println(slab);
	}


}