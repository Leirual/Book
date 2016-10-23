import java.util.Scanner;

public class CH02E06NumberDigitSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter a number between 0 and 1000");
			int number = scan.nextInt();
		
			if(number<=0 || number>=1000){
				System.out.println("Enter a correct number");
				number = scan.nextInt();
			}
			
			int digit1 = number / 100;
			System.out.println(digit1);
			int digit2 = (number / 10) % 10;
			System.out.println(digit2);
			int digit3 = number % 10;
			System.out.println(digit3);
			
			int sum = digit1 + digit2 + digit3;
			System.out.println("The sum of the number's digits is: " + sum);
		}
	}

}
