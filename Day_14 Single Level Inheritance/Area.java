// Java program to implement Area of Rectangle by using Single Level Inheritance
import java.util.Scanner;
class Shape 
{
    int length;
    int breadth;
}
class Rectangle extends Shape
{
    int area;
    public void calcualteArea()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length ");
        this.length=sc.nextInt();
        System.out.println("Enter Breadth ");
        this.breadth=sc.nextInt();
        area = length*breadth;
    }
}
class SingleInheritance
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        //Calculate the area
        r.calcualteArea();
        System.out.println("The Area of rectangle of length \""
                +r.length+"\" and breadth \""+r.breadth+"\" is \""+r.area+"\"");
    }
}

