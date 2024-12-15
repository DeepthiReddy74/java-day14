import java.util.*;
class createthreadlambdaexp2
{
    public static void main(String args[])
    {
        Runnable r=()->System.out.println(" i am new from java 8 version");
        Thread t=new Thread(r);
        System.out.println(t.isAlive());
    }
}