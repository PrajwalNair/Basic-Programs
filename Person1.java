class Person1
{
	public static void main(String[] Ramu)
	{
		String name=Ramu[0];
		System.out.println("The Name of Candiate is"+name);
		String emailID=Ramu[1];
		System.out.println("The emailId of candidate is"+emailID);
		String age=Ramu[2];
		System.out.println("The age of candiate is"+age);
		String area=Ramu[3];
		System.out.println("The area of candidate is"+area);
	
	int age1=Integer.parseInt(age);
	
	if(age1>=18)
	{
		System.out.println("Candidate is eligible for voting");
	
	
		if(age1>=21)
		{
		System.out.println("Candidate is eligible for marriage");
		}
	
		else
		{
		System.out.println("The least of andidate is not eligible for marriage");
		}
	}
	else
	{
		System.out.println("The least of candidate is not eligible for voting");
	}
	
	}
}