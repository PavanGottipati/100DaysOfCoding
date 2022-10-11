//Java Program for displaying details of Employee,Student,Department
//Using Method Overloading
class Details
{
    void display(int eno,String ename,double sal,int phone) //method with four parameters
    {
        System.out.println("The Employee Details are ");
        System.out.println("Employee number is "+eno);
        System.out.println("Employee name is "+ename);
        System.out.println("Employee salary is "+sal);
        System.out.println("Employee phone number is "+phone);
        System.out.println();
        System.out.println();
    }
    void display(int sno,String sname,float marks)  //method with three parameters
    {
        System.out.println("The Student Details are ");
        System.out.println("Student number is "+sno);
        System.out.println("Student name is "+sname);
        System.out.println("Student marks is "+marks);
        System.out.println();
        System.out.println();
    }
    void display(int dno,String dname)  //method with two parameters
    {
        System.out.println("Department Details are ");
        System.out.println("Department number is "+dno);
        System.out.println("Department Name is "+dname);
        System.out.println();
        System.out.println();
    }
}
public class Method_Overloading2 {
 public static void main(String [] args)
 {
    Details obj=new Details();
    obj.display(192012,"Pavan",98.3f); //method with three parameters
    obj.display(101,"Computers Science"); //method with two parameters
    obj.display(101,"Ravi kumar",25000.00,87980); //method with four parameters
 }
}
