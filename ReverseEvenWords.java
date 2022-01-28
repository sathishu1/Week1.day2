package assignment.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

		String[] array = test.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				char[] array1 = array[i].toCharArray();
				for (int j = array1.length - 1; j >= 0; j--) {
					System.out.print(array1[j]);
				}
			} else {
				System.out.print(" " + array[i] + " ");
			}
		}

	}

}