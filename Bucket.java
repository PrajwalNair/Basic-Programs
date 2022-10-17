class Bucket
{
		static String color = "red" ;
		static String brand  ;
		static double price ;
		static String material ;
		
		static {
			brand = "Nilkamal";
		}
		
		static void setPrice()
		{
			price = 120;
			System.out.println(price);
		}
		static void setPrice(double money)
		{
			System.out.println(money);
		}
		
		



}