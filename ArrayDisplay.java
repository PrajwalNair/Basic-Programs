class ArrayDisplay
{
	public static void main (String [] args)
	{
		Array a = new Array ();
		String [] values = a.setArray();
		int [] values1 = a.setIntArray();
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toint(values1));
	}
}