
//import Scanner class for user user input
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find reverse number ");
		int n = sc.nextInt();
		int rev = 0;
		sc.close();

		while (n > 0) {
			rev = (rev * 10) + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse number of given number is " + rev);
	}
}