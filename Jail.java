class Jail
{
	String name ;
	int noOfCells ;
	String [] staffNames ;
	int noOfGates ;
	
	
	void setNameAndNoOfCells(String name, int noOfCells)
	{
		this.name = name ;
		this.noOfCells = noOfCells;
	}
	
	
	Jail(String [] staffNames,int noOfGates)
	{
		this.staffNames = staffNames ;
		this.noOfGates = noOfGates ;
	}
	
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.noOfCells);
		
		for(int a=0; a<this.staffNames.length; a++)
		{
			System.out.println(this.staffNames[a]);
		}
		System.out.println(this.noOfGates);
	}
	
	
}