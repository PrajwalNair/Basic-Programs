class SignalDisplay
{
	public static void main(String [] args)
	{
		Signal rules = new Signal();
		System.out.println(rules.noOfSignals);
		System.out.println(rules.typeOfSignal);
		System.out.println(rules.lengthOfPole);
		System.out.println(rules.diaOfPole);
		System.out.println(rules.noOfSignalColors);
		System.out.println(rules.cctvSurvilliance);
		System.out.println(rules.redLight);
		System.out.println(rules.greenLight);
		
		
		rules.noOfSignals = 3;
		System.out.println(rules.noOfSignals);
		rules.typeOfSignal = "Stop,SlowDown,Go";
		System.out.println(rules.typeOfSignal);
		rules.lengthOfPole = 10;
		System.out.println(rules.lengthOfPole);
		rules.diaOfPole = 0.15;
		System.out.println(rules.diaOfPole);
		rules.noOfSignalColors = 3;
		System.out.println(rules.noOfSignalColors);
		rules.cctvSurvilliance = true;
		System.out.println(rules.cctvSurvilliance);
		rules.redLight = "Indicates the vehicles to stop";
		System.out.println(rules.redLight);
		rules.greenLight = "Indicates the vehicles to run";
		System.out.println(rules.greenLight);
		
	}


}