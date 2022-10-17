class CarromBoardDisplay 
{
	public static void main(String [] args)
	{
		CarromBoard carromBoard = new CarromBoard();
		System.out.println(CarromBoard.noOfCoins);
		System.out.println(carromBoard.noOfPlayers);
		System.out.println(carromBoard.typeOfBoard);
		CarromBoard carromBoard1 = new CarromBoard(1500);
		System.out.println(carromBoard.noOfWhiteCoins);
		System.out.println(carromBoard1.cost);
		
		
		
		CarromBoard carromBoard2 = new CarromBoard(2000);
		carromBoard2.noOfPlayers = 4;
		carromBoard2.typeOfBoard = "GSI Carrom Board";
		carromBoard2.noOfWhiteCoins = 9;	
		System.out.println(carromBoard2.noOfPlayers);
		System.out.println(carromBoard2.typeOfBoard);
		System.out.println(carromBoard2.noOfWhiteCoins);
		System.out.println(carromBoard2.cost);
		
		
		
		CarromBoard carromBoard3 = new CarromBoard(2500);
		carromBoard3.noOfPlayers = 2;
		carromBoard3.typeOfBoard = "Siscaa Carrom Board";
		carromBoard3.noOfWhiteCoins = 9;	
		System.out.println(carromBoard3.noOfPlayers);
		System.out.println(carromBoard3.typeOfBoard);
		System.out.println(carromBoard3.noOfWhiteCoins);
		System.out.println(carromBoard3.cost);
		
		
		
		CarromBoard carromBoard4 = new CarromBoard(2500);
		carromBoard4.noOfPlayers = 4;
		carromBoard4.typeOfBoard = "Siscaa Carrom Board";
		carromBoard4.noOfWhiteCoins = 9;	
		System.out.println(carromBoard4.noOfPlayers);
		System.out.println(carromBoard4.typeOfBoard);
		System.out.println(carromBoard4.noOfWhiteCoins);
		System.out.println(carromBoard4.cost);
		
	}
}