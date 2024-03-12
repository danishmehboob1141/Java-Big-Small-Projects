package AllSorting;

import java.util.Scanner;

public class BubbleSortFloat {

	static float[] bubbleSort(float[] arr, int size) {
		for (int pass=0; pass<size; pass++) {
			for (int i=0; i<size-1; i++	) {
				if (arr[i] > arr[i+1]) {
					float hold = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = hold;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		float[] arr;
		System.out.print("How many values you want to enter: ");
		int size=input.nextInt();
		arr = new float[size];
		
		System.out.println("Enter below the values");
		for (int i=0; i<size; i++)
			arr[i] = (float) input.nextDouble();
		
		System.out.print("\nOriginal Array : ");
		for (int i=0; i<size; i++)
			System.out.print(arr[i] + "  ");
		
		System.out.print("\n\nSorted Array: ");

		bubbleSort(arr, size);
		
//		for (int i=0; i<size; i++)
//			System.out.print(arr[i] + "  ");
		
		for (float k : bubbleSort(arr, size))
			System.out.print(k + "  ");
		
		
	}
}
