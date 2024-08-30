
//import Scanner class for user user input

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Prime or Not");
		int n = sc.nextInt();
		sc.close();
		boolean flag = true;
		if (n == 1)
			flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			} else
				continue;
		}
		if (flag)
			System.out.println("it is prime number");
		else
			System.out.println("It is not prime number");
	}
}
