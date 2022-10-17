class DividerDisplay
{
	public static void main (String [] args)
	{
		Divider parts = new Divider();
		System.out.println(parts.materialUsed);
		System.out.println(parts.lengthOfDivider);
		System.out.println(parts.widthOfDivider);
		System.out.println(parts.heightOfDivider);
		System.out.println(parts.purpose);
		System.out.println(parts.cost);
		System.out.println(parts.type);
		System.out.println(parts.painted);
		
		
		parts.materialUsed = "Concrete";
		System.out.println(parts.materialUsed);
		parts.lengthOfDivider = 1.5;
		System.out.println(parts.lengthOfDivider);
		parts.widthOfDivider = 1;
		System.out.println(parts.widthOfDivider);
		parts.heightOfDivider = 0.45;
		System.out.println(parts.heightOfDivider);
		parts.purpose = "Divide the roads";
		System.out.println(parts.purpose);
		parts.cost = 250000;
		System.out.println(parts.cost);
		parts.type = "Concrete";
		System.out.println(parts.type);
		parts.painted = true;
		System.out.println(parts.painted);
		
		
		
	}



}