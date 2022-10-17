class Person
{
	public static void main(String [] args)
	{
		String name = args [0];
		System.out.println("The name of the Candidate is "+name);
		String emailId = args [1];
		System.out.println("The emailID of the Candidate is "+emailId);
		String age = args [2];
		System.out.println("The age of the Candidate is "+age);
		String area = args [3];
		System.out.println("The area of the Candidate is "+area);
		
		int age1 = Integer.parseInt(age);
		
		if (age1 >= 18)
		{
			System.out.println("Candidate is eligible for Voting");
			if (age1 >= 21)
			{
				System.out.println("The candidate is eligible for the marriage");
			}
			else
			{
				System.err.println("The least age of candidate is not eligible for the marriage");
			}
		}
		else
		{
				System.err.println("Candidate is not eligible for voting");
		}
		

	}


}