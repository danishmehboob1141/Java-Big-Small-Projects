package AllSorting;

public class BubbleSort {

	public static void bubbleSort(char[] arr) {
		for(int pass=0; pass<arr.length; pass++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					char hold = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = hold;
				}
			}
		}
	}	
}
