package Basic;
public class Question4 {

	public static void main(String[] args) {
	   String s = "Hello";
	   System.out.println(Encryption(s));
	   String a = "�????";
	   System.out.println(Decryption(a));
	   
	}
	
	public static String Encryption(String str) {
	char [] charArray = str.toCharArray();
	String s = "";
	for (char c : charArray) {
		s += (char)((c-10)*3);
	}
	return s;
}
	public static String Decryption(String str) {
		char [] charArray = str.toCharArray();
		String s = "";
		for (char c : charArray) {
			s += (char)((c/3)+10);
		}
		return s;
	}


}
    