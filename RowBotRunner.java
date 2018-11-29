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
        
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        while(a == 0){
        if  (statement.equals("Bye"))
        {System.out.println("Ok bye");
            break;
        }
            System.out.println (maggie.getResponse(statement, same));
            statement = in.nextLine();
            same = statement;
        
        }
        
    
    }
}