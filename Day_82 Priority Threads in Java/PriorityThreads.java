// Java program to implement Multithreading by setting Priority
class Number extends Thread
{
 public void run()
 {
    try
    {
      for(int i=0;i<=10;i++)
      {
        System.out.println("Number "+i);
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
        for(int i=0;i<=10;i++)
        {
            System.out.println("Square of "+i+" "+((int)Math.pow(i,2)));
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }
}
class Cube implements Runnable
{
 public void run()
 {
    try
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Cube of "+i+" "+((int)Math.pow(i,3)));
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }
}
public class PriorityThreads
 {
    public static void main(String [] args)
    {
        Number t1=new Number();
        Square ob2=new Square();
        Cube ob3=new Cube();
        Thread t2=new Thread(ob2);
        Thread t3=new Thread(ob3);
        //Setting name for each Thread individually
        t1.setName("Number");
        t2.setName("Square");
        t3.setName("Cube");
        //Setting Priority for the Threads
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Three Threads are Created to print First 10 Numbers,  Square of First 10 Numbers and Cube Of First 10 Numbers");
        System.out.println("First Thread is "+t1.getName()+" And it's Priority is "+t1.getPriority());
        System.out.println("Second Thread is "+t2.getName()+" And it's Priority is "+t2.getPriority());
        System.out.println("Third Thread is "+t3.getName()+" And it's Priority is "+t3.getPriority());
    }
}
