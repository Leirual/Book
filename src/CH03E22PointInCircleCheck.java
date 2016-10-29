import java.util.InputMismatchException;
import java.util.Scanner;

public class CH03E22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double x = 0;
		double y = 0;

		while (x == 0) {
			System.out.println("Enter a point with two coordinates: ");
			x = scan.nextDouble();
			if (!scan.hasNextDouble()) {
				System.out.println("Wrong input");
				x = 0;
			}
		}

		while (y == 0) {
			if (scan.hasNextDouble()) {
				y = scan.nextDouble();
			} else {
				System.out.println("Wrong input");
				y = 0;
			}
		}

		/*
		 * if(scan.hasNextDouble()){ y = scan.nextDouble(); } else{
		 * System.out.println("Wrong input"); y = 0; continue; }
		 */

		int r = 10;
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		if (distance > r) {
			System.out.printf("Point (%.1f, %.1f) is not in the circle %n", x, y);
		} else {
			System.out.printf("Point (%.1f, %.1f) is in the circle %n", x, y);
		}

	}

}
