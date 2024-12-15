public class Implementingsleep
{
    public static void main(String[] args)
    {
        System.out.println("thread started.....");
        try{

            Thread.sleep(5000);
        }
        catch(Interrupted Exception e)
        {
            System.out.println("interrupted");
        }
        System.out.println("Thread resumed");
    }
}