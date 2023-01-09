// Java program to implement ArrayList in Collection framework
import java.util.*;  
class Arraylist{  
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
ArrayList<Integer> list1=new ArrayList<Integer>();//Creating arraylist  
int choice;
do{
  System.out.println("1.Add 2.Remove 3.Sort 4.Display 5.Exit");
  System.out.println("Enter your choice");
  choice=sc.nextInt();
  switch(choice)
  {
    case 1:
       System.out.println("Enter value");
       int val=sc.nextInt();
       list1.add(val);
       break;
    case 2:
       System.out.println("Enter position");
       int pos=sc.nextInt();
       list1.remove(pos);
       break;
    case 3:
       System.out.println("Element sorted successfully");
       Collections.sort(list1);
       break;
    case 4:
       System.out.println("The elements are "+list1);
       break;
    case 5:
       System.out.println("Exit.......");
       System.exit(0);
       break;
    default:
       System.out.println("Invalid choice");
       
  }  
  }while(choice!=5);
}
}   
