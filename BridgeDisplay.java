class BridgeDisplay
{
	public static void main (String [] args)
	{
		Bridge components = new Bridge();
		System.out.println(components.costOfBridgeInCr);
		System.out.println(components.typeOfBridge);
		System.out.println(components.durability);
		System.out.println(components.noOfPiers);
		System.out.println(components.lengthOfBridge);
		System.out.println(components.widthOfBridgeInMeter);
		System.out.println(components.noOfLanes);
		System.out.println(components.widthOfFootPathInMeter);
		
		
		
		components.costOfBridgeInCr = 200;
		System.out.println(components.costOfBridgeInCr);
		components.typeOfBridge = "Arch";
		System.out.println(components.typeOfBridge);
		components.durability = 70;
		System.out.println(components.durability);
		components.noOfPiers = 10;
		System.out.println(components.noOfPiers);
		components.lengthOfBridge = 1.2;
		System.out.println(components.lengthOfBridge);
		components.widthOfBridgeInMeter = 9;
		System.out.println(components.widthOfBridgeInMeter);
		components.noOfLanes = 4;
		System.out.println(components.noOfLanes);
		components.widthOfFootPathInMeter = 1;
		System.out.println(components.widthOfFootPathInMeter);
		
		
		
	}


}