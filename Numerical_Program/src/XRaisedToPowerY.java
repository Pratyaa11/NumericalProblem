import java.util.Scanner;

public class XRaisedToPowerY {
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base Number");
		int base = sc.nextInt();
		System.out.println("Enter Power Number");
		int power = sc.nextInt();
		int z=power;
		int pro = 1;
		sc.close();
		while (power > 0) {
			pro = pro * base;
			power--;

		}
		System.out.println(base + " raised to " + z + " is " + pro);
	}

}
