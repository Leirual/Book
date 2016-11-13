import java.util.Scanner;

public class CH05E17DisplayNumberPyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer between 1 and 15");

		int num = scan.nextInt();
		int y = 0;

		for (int i = 1; i <= num; i++) {

			for (int x = 0; x < (num - i); x++) {
				System.out.print("   ");
			}

			for (y = num - i; y < num; y++) {
				System.out.print(num - y);
				if (num - y < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}

			for (y = 2; y <= i; y++) {
				System.out.print(y);
				if (y < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}

	}

}
