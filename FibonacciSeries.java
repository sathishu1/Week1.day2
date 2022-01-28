package assignment.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int j = 8;
		int firstNum = 0;
		int secondNum = 1;

		System.out.println("Fibonacci Series\n" + firstNum + "\n" + secondNum);

		for (int i = 0; i <= j; i++) {
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
		}

	}

}