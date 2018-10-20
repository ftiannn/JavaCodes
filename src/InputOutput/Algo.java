package InputOutput;

public class Algo {
	public static String Encryption(String str) {
		char [] charArray = str.toCharArray();
		String s = "";
		for (char c : charArray) {
			s += (char)(c+1);
		}
		return s;
	}
	
	public static String Decryption(String str) {
		char [] charArray = str.toCharArray();
		String s = "";
		for (char c : charArray) {
			s += (char)(c-1);
		}
		return s;
	}
}
