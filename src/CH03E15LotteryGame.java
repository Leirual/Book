import java.util.Scanner;

public class CH03E15LotteryGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter your lottery number (three digits): ");
			int guess = scan.nextInt();
			int lottery = (int)(Math.random() * 100 +100);

			int l1 = lottery / 100;
			int l2 = lottery %100 / 10;
			int l3 = lottery % 10;

			int g1 = guess / 100;
			int g2 = guess %100 / 10;
			int g3 = guess % 10;

			System.out.println("The lottery number is: " + lottery);

			if(guess == lottery){
				System.out.println("Perfect! You win 10000$!");
			}
			else if((l1==g1 || l1==g2 || l1==g3) &&
					(l2==g1 || l2==g2 || l2==g3) &&
					(l3==g1 || l3==g2 || l3==g3) &&
					(l1+l2+l3) == (g1+g2+g3)){
				System.out.println("Yo've guessed all the right numbers! Close! You win 3000$!");
			}
			else if(l1==g1 ^ l1==g2 ^ l1==g3 ^
					l2==g1 ^ l2==g2 ^ l2==g3 ^
					l3==g1 ^ l3==g2 ^ l3==g3){
				System.out.println("Exactly one number is correct. You win 1000$!");
			}
			else{
				System.out.println("That sucks...");
			}
		}

		
	}
	
}
