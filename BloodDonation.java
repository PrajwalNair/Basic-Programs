class BloodDonation
{
	public static void main (String [] args)
	{
	int age  = 20;
	int weight = 65;
	
	if (age>=18)
	{
		if(weight>=54)
		{
			System.out.println("The candidate is eligible for blood donation");
		}
		
		else 
		{
			System.out.println("The candidate is not eligible for blood donation due to less weight");
		}
	}
	else 
		{
			System.out.println("Age must be greater than 18 for blood donation ");
		}
	}

}