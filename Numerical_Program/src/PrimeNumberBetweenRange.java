
//import Scanner class for user user input
import java.util.Scanner;

public class PrimeNumberBetweenRange {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Range to find Prime Number");
		int start = sc.nextInt();
		System.out.println("Enter End Point to find Prime Number");
		int end = sc.nextInt();
		sc.close();

		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(i);
		}

	}

}
