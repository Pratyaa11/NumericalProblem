
//import Scanner class for user user input
import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find product of Digit ");
		int n = sc.nextInt();
		sc.close();
		int pro = 1;
		while (n > 0) {
			pro = pro * (n % 10);
			n = n / 10;

		}
		System.out.println("Product of Digit is " + pro);

	}

}
