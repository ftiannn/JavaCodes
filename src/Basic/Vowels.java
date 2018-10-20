package Basic;

public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "It is a wonderful day";

		System.out.println(CountVowels(sentence));

	}



private static int CountVowels(String str) {
	int vowels = 0;
	
	str = str.toLowerCase();
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowels;
		}
	}
	
	return vowels;
}
}
