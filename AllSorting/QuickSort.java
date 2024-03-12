package AllSorting;

public class QuickSort {

	static public char[] arr;
	static public int size;
//	static public int high = arr.length - 1;
//	public static int low = 0;
	
	static public void quickSort(char[] arr, int high, int low) {
		if(low < high) {
			int pi = partition(arr, high, low);
			quickSort(arr, pi-1, low);
			quickSort(arr, high, pi+1);
		}
	}
	public static int partition(char[] arr, int high, int low) {
		char pivot = arr[high];
		int marker = low-1;
		for(int i=low; i<high; i++) {
			if(arr[i] <= pivot) {
				marker++;
				char hold = arr[i];
				arr[i] = arr[marker];
				arr[marker] = hold;
			}
		}
		char hold = arr[marker + 1];
		arr[marker + 1] = arr[high]; //what if we write pivot in place of arr[high] ? 
		arr[high] = hold;
		return (marker+1);
	}
	
}







