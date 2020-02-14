package carrental;

public class WellThread implements Runnable
{
	public void run()
	{
		try {
			System.out.println("Welcome to the CarRental System");
		} catch(Exception e) {
			System.out.println("Exception found");
		}
	}
}
