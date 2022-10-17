class NameDisplay
{
	public static void main (String [] getResult)
	{
		System.out.println("The element of index is :"+getResult[0]);
		System.out.println("The element of index is :"+getResult[1]);
		int a=getResult.length;
		System.out.println("Number of elements is equals to :"+a);
		String fname=getResult[0];
		String lname=getResult[1];
		Name.getFullName(fname,lname);
		
				
		boolean gender=true;		
		Name.getFullNameWithAbbrevation(fname,lname,gender);
		
	}


}