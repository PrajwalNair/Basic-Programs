class Cricket
{
	static void team (int noOfPlayers, String opponentTeam)
	{
		System.out.println("Total no. of players in the team "+noOfPlayers);
		System.out.println("The name of opponent team is "+opponentTeam);
	}
	
	static void team (int indianScore, int englandScore)
	{
		System.out.println("Score : "+indianScore);
		System.out.println(englandScore);
	}
	
	static void batting (int score, String typeOfShot ,String bestBatsman)
	{
		System.out.println("Total Score is "+score);
		System.out.println("It was a "+typeOfShot);
		System.out.println("The name of the batsman is"+bestBatsman);
	}
	
	static void batting (String openingBatsman ,int strikeRate)
	{
		System.out.println("Name of the Batsman"+openingBatsman);
		System.out.println("The strike Rate of the Batsman is "+strikeRate);
		
	}
	
	static void bowlers (String [] names)
	{
		for (int i=0; i<names.length; i++)
		{
		System.out.println(names[i]);
		}
		
		
	}
	
	static void bowlers (String bestBowlers)
	{
		System.out.println("The name of the best bowler is "+bestBowlers);
		
		
	}

}