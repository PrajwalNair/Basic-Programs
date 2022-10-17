class CarromBoard
{
	static int noOfCoins = 19 ;
	int noOfPlayers ;
	String typeOfBoard ;
	double cost ;
	int noOfWhiteCoins ;
	
	
	CarromBoard()
	{
		System.out.println("Welcome to the game");
	}
	
	
	CarromBoard(double price)
	{
		cost = price ;
	}
	
}