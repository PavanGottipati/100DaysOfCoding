//Java program to implement nested try blocks with exceptions
class NestedTry
{    
    public static void main(String args[]){   
    //outer try block   
     try{    
     //inner try block 1  
       try{    
        System.out.println("Inner try block 1 : going to divide by 0");    
        int b =39/0;    
      }  
       //catch block of inner try block 1  
       catch(ArithmeticException e)  
       {  
         System.out.println(e);  
         System.out.println();
       }    
          
       
       //inner try block 2  
       try{    
        System.out.println("Inner try block 2 : going to assign value in the out of size index in Array");
       int a[]=new int[5];    
     
       //assigning the value out of array bounds  
        a[5]=4;    
        }  
     
       //catch block of inner try block 2  
       catch(ArrayIndexOutOfBoundsException e)  
       {  
          System.out.println(e); 
          System.out.println(); 
       }    
       System.out.println("Rest Of The Code outside the inner try blocks 1 and 2...............");    
     }  
     //catch block of outer try block  
     catch(Exception e)  
     {  
       System.out.println("handled the exception (outer catch)");  
     }    
     System.out.println();
     System.out.println("Rest Of The Code Outside the Outer try block............");    
    }    
   }  
