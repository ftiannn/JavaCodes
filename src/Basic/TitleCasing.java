package Basic;

public class TitleCasing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String withoutCase = "its a wonderful day.";
	
		System.out.println(toTitleCase(withoutCase));
}
	
private static String toTitleCase(String str) {
        
        String[] words = str.split(" ");
        
        StringBuilder withCase = new StringBuilder( str.length() );
        
        for(String word : words){
 
            char[] charArray = word.toLowerCase().toCharArray();
            charArray[0] = Character.toUpperCase( charArray[0] );
            
            withCase.append( new String(charArray) ).append(" ");
        }
        
        return withCase.toString().trim();
}

}