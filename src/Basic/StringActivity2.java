package Basic;

public class StringActivity2 {
	public static void main(String[] args) {
		String str = "This is StringBuffer";
		System.out.println(str + "- This is a sample program");
		System.out.println(str.substring(0, 20) + " Object");
		System.out.println(new StringBuilder(str).reverse());
		System.out.println(str.replaceFirst("Buffer", "Builder"));
	}
}
