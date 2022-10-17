class Big

{
	public static void main(String[] args)//long
	{
		
		long c=Long.getLong("45",15555656151l);
		System.out.println(c);
		long d=Long.valueOf(84479842l);
		System.out.println(d);
		long e=Long.decode("23");
		System.out.println(e);
		long f=Long.getLong("1245l",5151553624l);
		System.out.println(f);
		long g=Long.valueOf("826",10);
		System.out.println(g);	
		long i=Long.reverseBytes(454221261l);
		System.out.println(i);
		String j=Long.toOctalString(461216514l);
		System.out.println(j);
		int a=Long.compare(2255418746l,5645115145l);
		System.out.println(a);
		int b=Long.signum(49724662l);
		System.out.println(b);
		String h=Long.toBinaryString(646413413l);
		System.out.println(h);
		
	}
}