package Basic;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "103-abc:102-xyz:101-lmn";
		ReturnDetails(sentence);
	}
	

private static void ReturnDetails(String str) {
	 String[] person = str.split(":");
	 int p = 0;
	 
	 for (int i = 0; i < 3 ; i++) {
		 String[] Details = person[i].split("-");
		 p = i + 1;
		 System.out.println("ID of Person " + p + " is ");
		 System.out.println(Details[0]);
		 
		 System.out.println("Name of Person " + p + " is ");
		 System.out.println(Details[1]);
	 }
}
}