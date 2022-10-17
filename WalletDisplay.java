class WalletDisplay
{
	public static void main (String [] args)
	{
		Wallet.brand ();
		Wallet.properties ("Wallets are used to store cash and cards");
		Wallet.size (12d, 5d);
		Wallet.model (true, false, true);
		Wallet.type (true, false, false, false);
		Wallet.store (2,5,8 ,false,5);
		
	}

}