class HospitalsDisplay
{
	public static void main (String [] args)
	{
		String [] a = {"Osteotomes","Gigli saws","Plate Benders"};
		
		Founder founder = new Founder("Devanand", "Hubli", Profession.PHYSICIAN, 1989, true, 1000000);
		Hospitals hospital = new Hospitals("Jituri", Specialization.ORTHOPAEDICS, a, 500, founder);
		hospital.printData ();
		Trainer trainer = new Trainer("Anil poojary", 9880912840l, 2.5);
		trainer.setAge(25);
		trainer.printData();
		
	}
}