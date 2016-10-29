import java.util.InputMismatchException;
import java.util.Scanner;

public class CH03E22PointInCircleCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double x = 0.0;
		double y = 0.0;
		boolean check = false;

		while (true) {

			while (check == false) {
				System.out.println("Enter a point with two coordinates: ");
				if (scan.hasNextDouble()) {
					x = scan.nextDouble();
					check = true;
				} else {
					System.out.println("Wrong input, try again");
					scan.next();
				}
			}

			while (check == true) {
				// scan.next();
				if (scan.hasNextDouble()) {
					y = scan.nextDouble();
					check = false;
				} else {
					System.out.println("Wrong input, try again");
					scan.next();
				}
			}

			int r = 10;
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

			if (distance > r) {
				System.out.printf("Point (%.1f, %.1f) is not in the circle %n", x, y);
			} else {
				System.out.printf("Point (%.1f, %.1f) is in the circle %n", x, y);
			}

		}

	}

}
