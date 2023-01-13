//Java program to implement Queue using PriorityQueue in Collections package
import java.util.*;
class QueueCollections {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue=new PriorityQueue<Integer>();
        int choice;
        do{
        System.out.println("1.Add(Offer) 2.Remove(Poll) 3.Peek 4.Display 5.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
              System.out.println("Enter element ");
              int element=sc.nextInt();
              queue.offer(element);
              System.out.println("Element offered into Queue successfully");
              break;
            case 2:
                if(null!=queue.poll()){
                    System.out.println("Element polled from the Queue successfully");
                    break;
                  }
                else{ 
                    System.out.println("Queue is Empty");
                }
                break;
            case 3:
              if(queue.isEmpty())
              {
                System.out.println("Queue is Empty");
              }
              else{
              System.out.println("The front most element is "+queue.peek());
              }
              break;
            case 4:
              if(queue.isEmpty())
              {
              System.out.println("Queue is Empty");
              }
               else{
               System.out.println("The elements are "+queue);
               }
              break;
            case 5:
              System.out.println("Exit............");
              System.exit(0);
              break;
            default:
              System.out.println("Invalid Choice");   
        }
       }while(choice!=5);
    }
}
