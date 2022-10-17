class Reddish
{
	public static void main (String [] args)
	
	{
		String [] groups = {"A+","A-","B+","B-","O+","O","AB+","AB-"};
		int totalGroups = groups.length;
		System.out.println("Total no. of blood groups : "+totalGroups);
		for (int blood=0; blood<groups.length; blood++)
		{
			System.out.println("The blood group is : "+groups[blood]);
		}
	}
}