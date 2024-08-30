
//import Scanner class for user user input
import java.util.Scanner;

public class SumOfEven_and_ProductOfOddDigit {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		int pro = 1;
		while (n > 0) {
			int digit = n % 10;
			if (digit % 2 == 0)
				sum = sum + digit;
			else
				pro = pro * digit;
			n = n / 10;

		}
		System.out.println("Sum of Even digit is " + sum);
		System.out.println("product of odd digit is " + pro);

	}
}