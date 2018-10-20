package addandreverse;
public class UserMainCode {

	public static int addAndReverse(Integer[] input1,Integer input2) {
		int sum = 0;
		for (int i = 0; i < input1.length; i++) {
			if (input1[i] > input2) {
				sum = sum + input1[i];
			}
		}
		return reverseNumber(sum);

	}
	
	public static int reverseNumber(int number){
    	int reversed = 0;
    	while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
    	return reversed; 
    }
}
