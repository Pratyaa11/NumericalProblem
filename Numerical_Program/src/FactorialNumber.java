
//import Scanner class for user user input
import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Factorial Of That Number");
		int n = sc.nextInt();
		int fact = 1;
		sc.close();
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		System.out.println("Factorial of Number is  " + fact);
	}
}
