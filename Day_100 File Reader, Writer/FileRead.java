//Java program to implement FileReader
import java.io.*;
class FileRead
{
  public static void main(String args[]) throws IOException{
  FileReader fr = new FileReader("FileRead.java");
  BufferedReader br= new BufferedReader(fr);
  String s;
  while((s = br.readLine()) != null) {
  System.out.println(s);
 }
 fr.close();
 }
}
