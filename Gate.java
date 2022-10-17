class Gate 
{
		static String shape = "Square" ;
		static String type  ;
		static String material ;
		static double cost ;
		
		static {
			type = "Main Gate";
		}
		
		static void setMaterial()
		{
			material = "Stainless Steel";
			System.out.println(material);
		}
		static void setMaterial(String materialUsed)
		{
			System.out.println(materialUsed);
		}



}