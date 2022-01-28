package assignment.day2;

public class Palindrome {
	public static void main(String[] args) {
		String name = "hannah";

		String revname = "";
		char ch;
		System.out.println("Name is:" + name);
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i); // extracts each character
			revname = ch + revname; // adds each character in front of the existing string
		}
		System.out.println("Reveresed String is:" + revname);
		if (name.equals(revname)) {
			System.out.println("Its a Palindrome");

		} else {
			System.out.println("Its not a Palindrome");
		}
	}
}
