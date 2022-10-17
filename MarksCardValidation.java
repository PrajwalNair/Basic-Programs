class MarksCardValidation
{
	public static void main (String [] args)
	{
		//marks validation
		//95 above outstanding S+
		//85-95 Excellent S
		//75-85 Very good A
		//65-75 good B 
		//55-65 First class C 
		//40-55 Second class D
		//35-40 Third class E
		//below 35 Fail F
		// invalid 
		
		int i = 99;
		
		if (i>=95 && i<=100)
		{
			System.out.println("Grade : S+ " + " (Outstanding) ");
		}
		
		else if (i>=85 && i<95)
		{
			System.out.println("Grade : S " + " (Excellent) ");
		}
		
		else if (i>=75 && i<85)
		{
			System.out.println("Grade : A " + " (Very good) ");
		}
		
		else if (i>=65 && i<75)
		{
			System.out.println("Grade : B " + " (Good) ");
		}
		
		else if (i>=55 && i<65)
		{
			System.out.println("Grade : C " + " (First class) ");
		}
		
		else if (i>=40 && i<55)
		{
			System.out.println("Grade : D " + " (Second class) ");
		}
		
		else if (i>=35 && i<40)
		{
			System.out.println("Grade : E " + " (Third class) ");
		}
		
		else if (i>=0 && i<35)
		{
			System.out.println("Grade : F " + " (Fail) ");
		}
		
		else 
		{
			System.out.println("Invalid");
		}
	}

}