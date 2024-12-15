class threadspro
{
    public static void main(String args[])
    {
        for (int i=0;i<=200;i++)
        {
        System.out.println(" Good Morning");
         try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
        System.out.println("Good Afteernoon");
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException v)
        {
            System.out.println(v);
        }
        System.out.println("Good Evening");
        }
    }
}
