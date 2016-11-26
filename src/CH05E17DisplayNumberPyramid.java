import java.util.Scanner;

public class CH05E17DisplayNumberPyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer between 1 and 15");

		int num = scan.nextInt();
		int y = 0;

		//makes a loop times the number stated
		for (int i = 1; i <= num; i++) {

			//in each row adds blank spaces before the first number
			for (int x = 0; x < (num - i); x++) {
				System.out.print("   ");
			}

			//prints numbers up to 1 depending on the current line, and makes a space after the number depending on its size
			for (y = num - i; y < num; y++) {
				System.out.print(num - y);
				if (num - y < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}

			//prints numbers after 1 with spaces as in the above loop
			for (y = 2; y <= i; y++) {
				System.out.print(y);
				if (y < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}
			//goes to next line
			System.out.println("");
		}

	}

}
