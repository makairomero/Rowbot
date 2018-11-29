import java.util.Scanner;

/**
 *
 */
public class RowBotRunner
{
	public static void main(String[] args)
	{
		RowBot maggie = new RowBot();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		
		System.out.println("Ok bye.");
	}

}