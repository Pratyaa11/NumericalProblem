
//import Scanner class for user user input
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find palindrome or not ");
		int n = sc.nextInt();
		int rev = 0;
		sc.close();
		int z = n;
		while (n > 0) {
			rev = (rev * 10) + n % 10;
			n = n / 10;

		}
		if (rev == z)
			System.out.println("It is Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}

}
