
//import Scanner class for user user input
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find it is Armstrong number or Not ");
		int n = sc.nextInt();
		int z = n;
		int count = 0;
		int sum = 0;
		sc.close();
		while (z > 0) {
			count++;
			z = z / 10;
		}

		z = n;
		while (z > 0) {
			int digit = z % 10;
			int pro = 1;
			for (int i = 1; i <= count; i++) {
				pro = pro * digit;

			}
			sum = sum + pro;
			z = z / 10;
		}
		if (sum == n)
			System.out.println("It is Armstrong Number");
		else
			System.out.println("Not Armstrong number");

	}

}
