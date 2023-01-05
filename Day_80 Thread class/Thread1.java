import java.util.*;
class MyThread extends Thread
{
  public void run()
  {
    try{
        System.out.println("Thread is running");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+i+"="+(i*i));
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  }
}
class Thread1
{
    public static void main(String [] args)
    {
       MyThread m=new MyThread();
       m.start();
    }
}
