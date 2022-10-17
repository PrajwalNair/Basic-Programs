class BusDisplay
{
	public static void main (String [] args)
	{
		Bus.type ();
		Bus.driving ("Driver");
		Bus.collector ("Give tickets",10d);
		Bus.dimensions (6d,2.4d,3d);
		Bus.seatAllocation (60d,25d, 25d,10d);
		Bus.features (true,"blue",6,5, 1);
	}
}