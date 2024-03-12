package AllSorting;

public class MergeSort {
	
	static void mergeSort(char[] arr) {
		int n = arr.length;
		int mid = n / 2;
		if(n<2)
			return;
		
		char[] left = new char[mid];
		char[] right = new char[n-mid];
		
		for(int i=0; i<mid; i++)
			left[i] = arr[i];
		for(int i=mid; i<n; i++)
			right[i-mid] = arr[i];
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}
	static void merge(char[] arr, char[] left, char[] right) {
		int nl = left.length;
		int nr = right.length;
		int i=0, j=0, k=0;
		while(i < nl && j < nr) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else if(left[i] > right[j]) {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while(i < nl) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < nr) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
}
