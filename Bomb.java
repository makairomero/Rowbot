
/**
 * Bomb
 * This is basically method to summon a wall of text.
 * 
 *
 * Designed by Makai.
 * 1.1.1
 */
public class Bomb
{
    public static void UnleashBomb()
    {
        System.out.println("Did you say bomb?");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("Preparing to unleash bomb in");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("5");
        try
        {
            Thread.sleep(1000); // This is basically a wait timer. However, we have to use a try and catch here.
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("4");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("3");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("2");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("1");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // for (int i = 1; i > 100; i++){
        // System.out.println("Boom");
        // }
        // I am not sure why this for loop won't work.
        int i = 0;
        while (i != 100){
            System.out.println("Boom");
            System.out.println("Booooom");
            System.out.println("Booooooooom");
            System.out.println("Boooooooooooooom");
            System.out.println("Boooooooooooooooooom");
            System.out.println("Booooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Booooooooooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Booooooooooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooooooooooooooooooom");
            System.out.println("Booooooooooooooooooooooooooom");
            System.out.println("Boooooooooooooooooom");
            System.out.println("Boooooooooooooom");
            System.out.println("Booooooooom");
            System.out.println("Booooom");
            System.out.println("Boom");
            // This wall of text looks like a spaceship doesn't it?.
            i += 1;
        }
        System.out.println("You just got nuked.");
    }
}
