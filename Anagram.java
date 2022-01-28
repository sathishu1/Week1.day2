package assignment.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";

		String text2 = "tosps";
		System.out.println(text1);
		System.out.println(text2);
		char[] a1 = text1.toCharArray();
		char[] a2 = text2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);
		if (Arrays.equals(a1, a2)) {
			System.out.println("Its an Anagram");

		} else {
			System.out.println("Not an Anagram");

		}

	}
}
