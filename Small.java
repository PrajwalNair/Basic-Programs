class Small
{
	public static void main(String [] args)
	{
		
		short b = Short.decode("1236");
		System.out.println(b);
		short c = Short.reverseBytes((short) 52);
		System.out.println(c);
		short d = Short.valueOf((short) 65);
		System.out.println(d);		
		short f = Short.parseShort("85");
		System.out.println(f);
		short g = Short.parseShort("12", 2);
		System.out.println(g);
		short h = Short.valueOf("125");
		System.out.println(h);
		short i = Short.valueOf("15", 2);
		System.out.println(i);
		short j = Short.valueOf("16", 1);
		System.out.println(j);
		int a = Short.compare((short) 48, (short) 95);
		System.out.println(a);
		long e = Short.toUnsignedLong((short) 45);
		System.out.println(e);
	}
}