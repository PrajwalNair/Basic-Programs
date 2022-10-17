class Trailor
{
	public static void main (String [] args)
	{
		String [] movies = {"directing","editing","effects","attraction","theme","acting","dialogue","cinematography","sound","music"};
		
		int total = movies.length;
		
		System.out.println("Total number of data  = "+total);
		
		for (int movie=movies.length-1; movie>=0; movie--)
		{
			System.out.println("Elements of movie data are : "+movies[movie]);
		}
	}
}