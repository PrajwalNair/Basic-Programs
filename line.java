class line
{
	public static void main(String [] args)
	{
		
		byte c=Byte.valueOf("12");
		System.out.println(c);
		byte d=Byte.valueOf("16",13);
		System.out.println(d);	
		byte f=Byte.decode("2");
		System.out.println(f);
		byte h=Byte.parseByte("124");
		System.out.println(h);
		byte i=Byte.parseByte("1", 2);
		System.out.println(i);	
		long a=Byte.valueOf((byte)10);
		System.out.println(a);
		int b=Byte.valueOf((byte)15);
		System.out.println(b);
		int e=Byte.hashCode((byte) 52);
		System.out.println(e);
		String j=Byte.toString((byte) 8);
		System.out.println(j);
		int g=Byte.compare((byte) 4, (byte) 5);
		System.out.println(g);
		
	}
}