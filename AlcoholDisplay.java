class AlcoholDisplay
{
	public static void main (String [] args)
	{
		Alcohol alcohol = new Alcohol ();
		System.out.println(Alcohol.precaution);
		System.out.println(alcohol.brand);
		System.out.println(alcohol.alcoholPercent);
		System.out.println(alcohol.price);
		System.out.println(alcohol.mrp);
		
		Alcohol alcohol1 = new Alcohol ("Imperial Blue");
		alcohol1.alcoholPercent = 42.8;
		alcohol1.price = 198;
		alcohol1.mrp = true;
		System.out.println(alcohol1.brand);
		System.out.println(alcohol1.alcoholPercent);
		System.out.println(alcohol1.price);
		System.out.println(alcohol1.mrp);
		
		
		Alcohol alcohol2 = new Alcohol ("Beera");
		alcohol2.alcoholPercent = 8;
		alcohol2.price = 180;
		alcohol2.mrp = true;
		System.out.println(alcohol2.brand);
		System.out.println(alcohol2.alcoholPercent);
		System.out.println(alcohol2.price);
		System.out.println(alcohol2.mrp);
		
		
		Alcohol alcohol3 = new Alcohol ("Black & White");
		alcohol3.alcoholPercent = 43;
		alcohol3.price = 1450;
		alcohol3.mrp = true;
		System.out.println(alcohol3.brand);
		System.out.println(alcohol3.alcoholPercent);
		System.out.println(alcohol3.price);
		System.out.println(alcohol3.mrp);
		
		
		Alcohol alcohol4 = new Alcohol ("Smirnoff");
		alcohol4.alcoholPercent = 40;
		alcohol4.price = 1853;
		alcohol4.mrp = true;
		System.out.println(alcohol4.brand);
		System.out.println(alcohol4.alcoholPercent);
		System.out.println(alcohol4.price);
		System.out.println(alcohol4.mrp);
		
		
	}
	
	
	
}