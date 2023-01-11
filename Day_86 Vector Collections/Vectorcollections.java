//Java Program to implement Vector in Collections package
import java.util.Vector;
import java.util.Scanner;
class VectorCollections 
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		    // Creating an empty Vector
		    Vector<Integer> vec_tor = new Vector<Integer>();
        int choice;
        do{
            System.out.println("1.Add 2.AddIndex 3.RemovePosition 4.Update 5.Display 6.Exit");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                  System.out.println("Enter value to be added");
                  int val=sc.nextInt();
                  vec_tor.add(val);
                  System.out.println("Value added successfully");
                  break;
                case 2:
                  System.out.println("Enter value to be added");
                  int vals=sc.nextInt();
                  System.out.println("Enter Position to be inserted");
                  int pos=sc.nextInt();
                  vec_tor.add(pos,vals);
                  System.out.println("Value inserted at position successfully");
                  break;
                case 3:
                  System.out.println("Enter position to be deleted");
                  int p=sc.nextInt();
                  vec_tor.remove(p-1);
                  System.out.println("Value deleted from Vector successfully");
                  break;
                case 4:
                  System.out.println("Enter index to be updated");
                  int index=sc.nextInt();
                  System.out.println("Enter value to be updated");
                  int v=sc.nextInt();
                  vec_tor.set(index,v);
                  System.out.println("Value updated successfully");
                  break;
                case 5:
                  System.out.println("The elements in Vector are "+vec_tor);
                  break;
                case 6:
                  System.exit(0);
                  break;
                default:
                  System.out.println("Invalid Choice");
            }
        }while(choice!=6);
	}
}
