package InputOutput;
import java.io.*;

public class Encryption {
   public static void main(String args[]) {
	   write();
	   }
   
   public static void write(){
	   FileOutputStream fileOutput = null;
	   String input = read();
	   try {
		   fileOutput = new FileOutputStream("D:/newHello.txt");
		   byte[] buffer = new byte[100];
		   buffer = input.getBytes();
		   fileOutput.write(buffer);
		   System.out.println("Encrypted & written to file");
	   } catch (FileNotFoundException fileOut) {
		   fileOut.printStackTrace();
	   } catch (IOException ioe) {
		   ioe.printStackTrace();
	   } finally {
		   try {
			   fileOutput.close();
		   } catch (IOException ioe) {
			   ioe.printStackTrace();
		   }
	   }
   }
   
   public static String read() {
	   String content = "";
	   FileInputStream fileStream = null;
	   int ch;
	   
	   try {
		   fileStream = new FileInputStream("D:/hello.txt");
		   while ((ch = fileStream.read()) != -1) {
			   content=content+((char) ch);
		   }
		   content = Algo.Encryption(content);

	   }
		   
		   catch (FileNotFoundException fileNotFound) {
			   fileNotFound.printStackTrace();
		   } catch (IOException ioexp) {
			   ioexp.printStackTrace();
		   } finally {
			   try {
				   fileStream.close();
			   } catch (IOException ioexp) {
				   ioexp.printStackTrace();
			   }
		   }
	return content;
   	}
}