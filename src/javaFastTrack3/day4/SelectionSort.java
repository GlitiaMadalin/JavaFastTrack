package javaFastTrack3.day4;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[50];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("Before sorting\n");
		System.out.println(Arrays.toString(array));
		// int[] array = { 6, 8, 3, 5, 2, 1 };

		// assuming that the array's first index has the min value
		int minValue;
		int minValueIndex;
		
		// the O notation of that is O(n ^ 2) which is not efficient
		for (int i = 0; i < array.length; i++) {
			minValue = array[i];
			minValueIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (minValue > array[j]) {
					minValue = array[j];
					minValueIndex = j;
				}
			}

			// this is swapping
			if (minValue != array[i]) {
				int temp = array[i];
				array[i] = minValue;
				array[minValueIndex] = temp;
			}

		}
		System.out.println("\nAfter sorting\n");
//		for (int i : array) {
//			System.out.print(i + " ");
//		}
		
		System.out.println(Arrays.toString(array));
	}
}
// to practice swapping 
// int a = 6;
// int b = 10;
// assign the a's valus to the b 
// and assign the b's value to the a
// int temp = a; returns 6
// a = b; returns 10
// b = temp; returns 6