package AllSorting;

import java.util.Scanner;

public class Run{

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		BubbleSort bs = new BubbleSort();
				
		char[] a = 	{'g', 'e', 'i', 'f', 'c', 'l', 'j', 'b', 'd', 'a', 'h', 'k'};
		
//		ms.mergeSort(a);
//		qs.quickSort(a, a.length-1, 0);
//		bs.bubbleSort(a);
//		ss.selectionSort(a);
//		is.insertionSort_Asc(a);
//		bs.bubbleSort(a);
		for(char k : a)
			System.out.print(k + " ");
		
	}

}
