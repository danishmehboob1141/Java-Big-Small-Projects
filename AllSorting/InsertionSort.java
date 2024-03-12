package AllSorting;

public class InsertionSort {
	
	public static void insertionSort_Asc(char[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			char key = arr[i];
			int marker = i-1;
			while(marker >= 0 && arr[marker] > key) {
				arr[marker+1] = arr[marker];
				marker--;
			}
			arr[marker+1] = key;
		}
	}
	static void insertionSort_Dec(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			
		}
	}
	
}
