class Politics
{
	public static void main (String [] args)
	{
		String [] primeMinisters = {"narendraModi","atalBihariVajpayee","manMohanSingh","gulzarilalNanda","lalBahadurShastri","indiraGandhi","rajivGandhi",
		"chandraShekhar","morajiDesai","charanSingh"};
		int size = primeMinisters.length;
		System.out.println(size);
		for (int members=0; members<primeMinisters.length; members++)
		{
			System.out.println("Prime Ministers of India : "+primeMinisters[members]);
			
		}
		
		primeMinisters [4] = "NA";
		primeMinisters [7] = "NA";
		primeMinisters [9] = "NA";
		
		System.out.println("-------------------------");
		
		for (int members=0; members<primeMinisters.length; members++)
		{
			System.out.println("Prime Ministers of India : "+primeMinisters[members]);
		}
	
	}
}