package assignment.day2;

public class FindType {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] a1 = test.toCharArray();
		int length = a1.length;
		for (int i = 0; i < length; i++) {
			if (Character.isLetter(a1[i])) {
				letter++;
			}

			else if (Character.isDigit(a1[i])) {
				num++;
			} else if

			(Character.isSpaceChar(a1[i])) {
				space++;
			}

			else {
				specialChar++;

			}
		}
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharacter: " + specialChar);
	}

}
