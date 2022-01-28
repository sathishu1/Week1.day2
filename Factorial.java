package assignment.day2;

public class Factorial {
	public static void main(String[] args) {
		int n = 10;
		int fact = 1;

		for (int i = 1; i < n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of a number:" + fact);
	}

}
