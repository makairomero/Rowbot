import java.util.Scanner;

/**
 *
 */
public class RowBotRunner
{
    public static void main(String[] args)
    {
        String same = ""; 
        RowBot maggie = new RowBot();
        
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        
        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement, same));
            statement = in.nextLine();
            same = statement;
        }
        
        System.out.println("Ok bye.");
    }

}