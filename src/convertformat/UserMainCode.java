package convertformat;
public class UserMainCode {

	public static String convertFormat(String inputString) {
		String[] arr = inputString.split("-");
		inputString = "";
		for(String str : arr){
			inputString += str;
		}
		
		String format = "xx-xx-xxx-xxx";
		String returnString = "";
		int numHyphen = 0; 
		for(int i=0; i<format.length(); i++){
			if(format.charAt(i)=='-'){
				returnString+="-";
				numHyphen++;
			}else{
				returnString+=inputString.charAt(i-numHyphen);
			}
		}
		
		return returnString; 
	}
}
