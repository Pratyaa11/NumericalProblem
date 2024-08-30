
//import Scanner class for user user input
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number till you want Fibonacci Series ");

		int n = sc.nextInt();
		sc.close();
		int x = 0;
		int y = 1;
		int z = 0;
		System.out.println("Fibonacci Series is ");
		while (z <= n) {
			System.out.println(z);
			x = y;
			y = z;
			z = x + y;
		}
	}

}
