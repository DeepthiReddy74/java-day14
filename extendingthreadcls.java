import java.util.*;
class a extends Thread
{
    public void r()
    {
        System.out.println(" hello i am thread");
    }
}
public class extendingthreadcls
{
    public static void main(String args[])
    {
        a g=new a();
        g.r();
        g.start();
    }
}