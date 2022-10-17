class AtmDisplay
{
	public static void main (String [] args)
	{
		Atm value = new Atm();
		System.out.println(value.nameOfBank);
		System.out.println(value.location);
		System.out.println(value.depositMachine);
		System.out.println(value.passbookEntry);
		System.out.println(value.cctvSurviliance);
		System.out.println(value.pincode);
		System.out.println(value.cardNo);
		System.out.println(value.debitCard);
		
		
		
		value.nameOfBank = "Bank od Baroda";
		System.out.println(value.nameOfBank);
		value.location = "Hubli";
		System.out.println(value.location);
		value.depositMachine = true;
		System.out.println(value.depositMachine);
		value.passbookEntry = true;
		System.out.println(value.passbookEntry);
		value.cctvSurviliance = true;
		System.out.println(value.cctvSurviliance);
		value.pincode = 1432;
		System.out.println(value.pincode);
		value.cardNo = 452687451254l;
		System.out.println(value.cardNo);
		value.debitCard = true;
		System.out.println(value.debitCard);
		
	}
	



}