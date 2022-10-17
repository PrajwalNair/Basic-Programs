class PoliceStation 
{
	String name = "Mico Layout";
	int noOfStaffs ;
	String nameOfInspector ;
	String [] kaidiNames;
	
	PoliceStation(String [] kaidiNames)
	{
		this.kaidiNames=kaidiNames;
	}
	
	void setNoOfStaffs(int noOfStaffs)
	{
		this.noOfStaffs=noOfStaffs;
	}
	
	void printdata ()
	{
		System.out.println(this.name);
		System.out.println(this.noOfStaffs);
		System.out.println(this.nameOfInspector);
		
		for(int count=0;count<this.kaidiNames.length;count++)
		{
			System.out.println(this.kaidiNames[count]);
		}	
	}
	
}