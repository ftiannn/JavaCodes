package InputOutput;
import java.io.*;
public class Decryption {
	   public static void main(String args[]) {
		   read();
		   }
	   
	   public static void read() {
		   String content = "";
		   FileInputStream fileStream = null;
		   int ch;
		   
		   try {
			   fileStream = new FileInputStream("D:/newHello.txt");
			   while ((ch = fileStream.read()) != -1) {
				   content=content+((char) ch);
			   }
			   System.out.println("Before decryption: " + content);
			   content = Algo.Decryption(content);


		   }
			   
			   catch (FileNotFoundException fileNotFound) {
				   fileNotFound.printStackTrace();
			   } catch (IOException ioexp) {
				   ioexp.printStackTrace();
			   } finally {
				   try {
					   System.out.println("After Decryption: " + content);
					   fileStream.close();
				   } catch (IOException ioexp) {
					   ioexp.printStackTrace();
				   }
			   }

	   	}
}
