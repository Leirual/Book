import java.util.Scanner;

public class CH05E14GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner scanNumber1 = new Scanner(System.in);
		Scanner scanNumber2 = new Scanner(System.in);

		System.out.println("Please state two numbers: ");

		int n1 = scanNumber1.nextInt();
		int n2 = scanNumber2.nextInt();
		int temp = 0;

		if (n2 < n1) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}

		int div = n1;

		for (int i = 0; i < n1; i++) {
			div = n1 - i;
			if ((n1 % div == 0) && (n2 % div == 0)) {
				System.out.println(div + " is the greateat common divisor");
				break;
			}
		}
	}
}
