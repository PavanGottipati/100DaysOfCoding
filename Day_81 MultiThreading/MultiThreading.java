// Java program to implement Multi Threading
class Even extends Thread
{
 public void run()
 {
    try
    {
      for(int i=0;i<=10;i++)
      {
        System.out.println("Even "+(2*i));
      }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }
}
class Odd implements Runnable
{
 public void run()
 {
    try
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Odd "+((2*i)+1));
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }
}
class Square implements Runnable
{
 public void run()
 {
    try
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("square "+i+" "+(i*i));
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }
}
public class MultiThreading
 {
    public static void main(String [] args)
    {
        Even t1=new Even();
        Odd ob2=new Odd();
        Square ob3=new Square();
        Thread t2=new Thread(ob2);
        Thread t3=new Thread(ob3);
        t1.setName("Even");
        t2.setName("Odd");
        t3.setName("Square");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Three Threads are Created to print first 10 Even Numbers, first 10 Odd Numbers and Square Of First 10 Natural Numbers");
        System.out.println("First Thread is "+t1.getName());
        System.out.println("Second Thread is "+t2.getName());
        System.out.println("Third Thread is "+t3.getName());
    }
}
