package convertformat;
import java.io.*;
class Main
{
   public static void main(String args[]) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
     String inputString = br.readLine(); 
     System.out.println(UserMainCode.convertFormat(inputString));
   }
}
