class SpeakerDisplay
{
	public static void main (String [] args)
	{
		Speaker speaker = new Speaker ();
		System.out.println(Speaker.purpose);
		System.out.println(speaker.brand);
		System.out.println(speaker.frequency);
		System.out.println(speaker.price);
		System.out.println(speaker.rating);
		
		Speaker speaker1 = new Speaker (4500);
		speaker1.brand = "Phillips";
		speaker1.frequency = "2.1Z";
		speaker1.rating = 4.7;
		System.out.println(speaker.brand);
		System.out.println(speaker.frequency);
		System.out.println(speaker.price);
		System.out.println(speaker.rating);
		
		Speaker speaker2 = new Speaker (5000);
		speaker2.brand = "Intex";
		speaker2.frequency = "2.2Z";
		speaker2.rating = 4.5;
		System.out.println(speaker2.brand);
		System.out.println(speaker2.frequency);
		System.out.println(speaker2.price);
		System.out.println(speaker2.rating);
		
		Speaker speaker3 = new Speaker (4000);
		speaker3.brand = "Audio";
		speaker3.frequency = "2.0Z";
		speaker3.rating = 4.3;
		System.out.println(speaker3.brand);
		System.out.println(speaker3.frequency);
		System.out.println(speaker3.price);
		System.out.println(speaker3.rating);
		
		Speaker speaker4 = new Speaker (4600);
		speaker4.brand = "Boat";
		speaker4.frequency = "2.4Z";
		speaker4.rating = 4.9;
		System.out.println(speaker4.brand);
		System.out.println(speaker4.frequency);
		System.out.println(speaker4.price);
		System.out.println(speaker4.rating);
		
	}
}