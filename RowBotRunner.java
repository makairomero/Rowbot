import java.util.Scanner;

/**
 *
 */
public class RowBotRunner
{
    public static void main(String[] args)
    {
        int a= 0;

        RowBot maggie = new RowBot();
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        String same = "asdasda";
        //Bomb boom = new Bomb();
        while(a == 0){

            if  (statement.equals("Bye"))
            {System.out.println("Ok bye");
                break;
            }
            // if (statement.toLowerCase().equals("bomb"))
            // {
                // System.out.println(boom.getResponse(statement, same));
                // same = statement;
                // statement = in.nextLine();
            // }
            System.out.println (maggie.getResponse(statement,same));
            same= statement;
            statement = in.nextLine();
        }

    }
}