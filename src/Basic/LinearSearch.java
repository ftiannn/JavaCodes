package Basic;
public class LinearSearch {
	public static void main (String[] args) {
        
        int arr[] = {2,8,2,4,2,3,8,4};
        int n = arr.length;
        CountNumber(arr, n);
	}
	
	public static void CountNumber(int arr[], int length){
        int index = 0;
        int [] count = new int[8];

        for(int i = 0; i < length; i++){
        	index = arr[i];
            count[index]++;
        }

        for(int i=1; i < count.length; i++){
        	if(count[i] > 0){
        		System.out.println(" The number of occurence of " + i + ": " + count[i]);
           	}

        }

	}
}