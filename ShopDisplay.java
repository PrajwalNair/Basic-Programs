class ShopDisplay
{
	public static void main (String [] args)
	{
		Shop.open ();
		Shop.close (6.0d);
		Shop.area (100d ,150d);
		Shop.selling (20 ,400 ,200);
		Shop.buying ("2012GST9857462500" ,4  ,true,45);
		Shop.details ("koppikar Road" ,"hardware" ,"lulu",10.4 ,4.6f);
	}
}