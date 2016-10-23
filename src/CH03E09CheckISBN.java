import java.util.Scanner;

public class CH03E09CheckISBN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		
		int number = scan.nextInt();
		
		int d9 = number%10;
		int d8 = number%100 /10;
		int d7 = number%1000 / 100;
		int d6 = number%10000 / 1000;
		int d5 = number%100000 / 10000;
		int d4 = number%1000000 / 100000;
		int d3 = number%10000000 / 1000000;
		int d2 = number%100000000 / 10000000;
		int d1 = number%1000000000 / 100000000;

		int d10 = ((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11;
		
		System.out.printf("The ISBN-10 number is: %d%d%d%d%d%d%d%d%d", d1,d2,d3,d4,d5,d6,d7,d8,d9);
		if(d10 == 10){
			System.out.print("X");
		}
		else{
			System.out.print(d10);
		}
		
	}
}
