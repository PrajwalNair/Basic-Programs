class JailDisplay
{
	public static void main (String [] datas)
	{
		String [] names = {"prince","raja","babu","sona"};
		Jail jail = new Jail(names,4);
		jail.setNameAndNoOfCells("parappana agrahara", 20);
		jail.printData();
	}
}