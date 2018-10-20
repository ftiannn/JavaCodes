package addandreverse;
import java.io.*;
class Main
{
   public static void main(String args[]) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
     Integer n = Integer.parseInt(br.readLine());
     Integer[] inputElements = new Integer[n];
     for(int i=0;i<n;i++) {
    	 inputElements[i] = Integer.parseInt(br.readLine());
     }
     Integer inputString2 = Integer.parseInt(br.readLine());
     System.out.println(UserMainCode.addAndReverse(inputElements,inputString2));
   }
}
