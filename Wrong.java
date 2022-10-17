class Wrong
{
	public static void main(String[] args) //boolean
	{
		
		boolean a=Boolean.getBoolean("man");
		System.out.println(a);
		boolean b=Boolean.logicalAnd(true,false);
		System.out.println(b);
		boolean c=Boolean.logicalOr(false,false);
		System.out.println(c);
		boolean d=Boolean.logicalXor(true,false);
		System.out.println(d);
		int e=Boolean.compare(true,true);
		System.out.println(e);		
		String f=Boolean.toString(true);
		System.out.println(f);
		boolean g=Boolean.valueOf("gap");
		System.out.println(g);		
		boolean i=Boolean.parseBoolean("age");
		System.out.println(i);
		boolean j=Boolean.valueOf("song");
		System.out.println(j);
		int h=Boolean.hashCode(false);
		System.out.println(h);
	
	}
}


