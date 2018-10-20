package Basic;
import java.util.Arrays;


public class MaxCount {
	public static void main (String[] args) {
        
        int arr[] = {2,8,2,4,2,3,8,4};
        int n = arr.length;
        System.out.println("The max occurance is: " + MaxOccurance(arr,n));
         
    }
	 static int MaxOccurance(int arr[], int n) {
	        Arrays.sort(arr);
	        int max_count = 1, element = arr[0], curr_count = 1;
	         
	        for (int i = 1; i < n; i++) {
	            if (arr[i] == arr[i - 1]) {
	                curr_count++;
	            }
	            else {
	                if (curr_count > max_count) {
	                    max_count = curr_count;
	                    element = arr[i - 1];
	                }
	                curr_count = 1;
	            }
	        }
	     
	        if (curr_count > max_count) {
	            max_count = curr_count;
	            element = arr[n - 1];
	        }
	     
	        return element;
	    }
}
