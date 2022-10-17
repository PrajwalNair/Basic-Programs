class Lotus{
public static void main (String [] args)
{
	String [] primeMinisters = {"narendraModi","atalBihariVajpayee","manMohanSingh","gulzarilalNanda","lalBahadurShastri","indiraGandhi","rajivGandhi",
	"chandraShekhar","morajiDesai","charanSingh"};
	
	int size = primeMinisters.length;
	
	
	//for (int i=primeMinisters.length-1;i>=0;i--)
	//{
	//	System.out.println(primeMinisters[i]);
	//}
	
	primeMinisters [4] = "Na";
	primeMinisters [7] = "Na";
	primeMinisters [9] = "Na";
	for (int i=9;i<primeMinisters.length+1;i--)
	{
		
		System.out.println(primeMinisters[i]);
	}
	
	
	
}

}
