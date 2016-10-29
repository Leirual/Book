import java.util.Scanner;
public class CH04E02GreatCircleDistance {

	public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		double x = 0.0;
		double y = 0.0;
		double r = 6371.01;
		double d;
		
		boolean check = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		
		while (check == false) {
			if (scan.hasNextDouble()) {
				a = scan.nextDouble();
				check = true;
			} else {
				System.out.println("Wrong input, try again");
				scan.next();
			}
		}
		while (check == true) {
			if (scan.hasNextDouble()) {
				b = scan.nextDouble();
				check = false;
			} else {
				System.out.println("Wrong input, try again");
				scan.next();
			}
		}
			
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		
		while (check == false) {
			if (scan.hasNextDouble()) {
				x = scan.nextDouble();
				check = true;
			} else {
				System.out.println("Wrong input, try again");
				scan.next();
			}
		}
		while (check == true) {
			if (scan.hasNextDouble()) {
				y = scan.nextDouble();
				check = false;
			} else {
				System.out.println("Wrong input, try again");
				scan.next();
			}
		}
		
		d = r * Math.acos(Math.sin(Math.toRadians(a)) * Math.sin(Math.toRadians(b)) + Math.cos(Math.toRadians(a)) * Math.cos(Math.toRadians(b)) * 
				Math.cos(Math.toRadians(x) - Math.toRadians(y)));
		System.out.println("The distance is: " + d + "km");
		
	}
}
