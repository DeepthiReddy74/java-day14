import java.util.*;
class a implements Runnable
{
    public void run()
    {
        System.out.println("hello i am thread");
    }
}
public class implementingrunnableitf
{
    public static void main(String args[])
    {
    a r=new a();
    Thread s=new Thread(r);
    s.start();
    s.run();
}
}