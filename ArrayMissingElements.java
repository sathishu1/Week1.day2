package assignment.day2;

import java.util.Arrays;

public class ArrayMissingElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8 };
		Arrays.sort(arr);
		System.out.println("Array length:" + arr.length);
		
		for (int i = 1; i <= arr.length; i++) {
			if (i!= arr[i-1]) {
				System.out.println("Missing Element is:" + i);
				break;
			}
		}
	}
}
