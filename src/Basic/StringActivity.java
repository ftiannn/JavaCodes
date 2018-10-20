package Basic;

public class StringActivity {
	public static void main(String[] args) {
		String str = "Welcome to Java World";
		System.out.println(str.charAt(4));
		System.out.println(str.equals("Welcome"));
		System.out.println(str + "- Let us learn");
		System.out.println(str.indexOf("a"));
		System.out.println(str.replaceAll("a","e"));
		System.out.println(str.substring(3, 9));
		System.out.println(str.toLowerCase());
	}



}
