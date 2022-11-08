//Java program to find the occurances of two vowels in succession.
import java.util.Scanner;
class VowelSuccession
{
  public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line ");
        String str=sc.nextLine();
        String strArr[]=str.split(" ");
        int count=0;
        char ch1,ch2;
        for(String s:strArr)
        {
            for(int i=0;i<s.length()-1;i++)
            {
                ch1=s.charAt(i);
                ch2=s.charAt(i+1);
                String p="";
                p=p+ch1+ch2;
                if((p.equals("ae")) || (p.equals("ai")) || (p.equals("ao")) || (p.equals("au")) || (p.equals("ea")) || (p.equals("ei")) || (p.equals("eo")) || (p.equals("eu")) || (p.equals("ia")) || (p.equals("ie")) || (p.equals("io")) || (p.equals("iu")) || (p.equals("oa")) || (p.equals("oe")) || (p.equals("oi")) || (p.equals("ou")) || (p.equals("ua")) || (p.equals("ue")) || (p.equals("ui")) || (p.equals("uo")))
                {
                    count++;
                    System.out.println(p);
                }
            }
        }
        System.out.println("The no of vowel successions are "+count);
    }
}
