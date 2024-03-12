package AllSorting;

public class SelectionSort {

	static char[] selectionSort_Asc(char[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
			if(min != i) {
				char hold = arr[min];
				arr[min] = arr[i];
				arr[i] = hold;
			}
		}
		return arr;
	}
}
