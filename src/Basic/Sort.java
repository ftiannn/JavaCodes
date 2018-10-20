package Basic;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"susan", "mary", "alice", "benjamin", "cathy"};
		System.out.println("Unsorted array:");
			for(String element: array) {
				System.out.println(element + " ");
		      	System.out.println(" ");
			}
		      	selectionSort(array);
		      	System.out.println("SelectionSorted array:");
		      	
			for(String element: array) {
		            System.out.print(element + " ");
		            System.out.println();
			}

	}
	
	static void selectionSort(Comparable[] array)
	 {
	      int smallindex;
	      for(int i = 0; i < array.length; i++)
	      {
	           smallindex = i; // set first element as smallest
	           for(int j = i + 1; j < array.length; j++) // find smallest
	                if(array[j].compareTo(array[smallindex]) < 0)
	                     smallindex = j;
	           if(smallindex != i)
	                swap(array, smallindex, i);
	      }
	 }
	
	static void swap(Object[] array, int index1, int index2)
	 {
	      Object temp = array[index1];
	      array[index1] = array[index2];
	      array[index2] = temp;
	 } 
}