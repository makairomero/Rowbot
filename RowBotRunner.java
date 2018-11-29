import java.util.Scanner;

/**
 *
 */
public class RowBotRunner
{
    public static void main(String[] args)
    {
        int a = 0;
        String same = ""; 
        RowBot maggie = new RowBot();
        
        System.out.println (maggie.getGreeting());
        while(a == 0){
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        
        if  (statement.equals("Bye"))
        {System.out.println("Bye");
            break;
        }
            System.out.println (maggie.getResponse(statement, same));
            statement = in.nextLine();
            same = statement;
        
        }
        System.out.println("Ok bye.");
    
    }
}