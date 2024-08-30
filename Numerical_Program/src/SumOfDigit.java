
//import Scanner class for user user input
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;

		}
		System.out.println("Sum of Digit is " + sum);

	}

}
