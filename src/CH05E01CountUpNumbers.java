import java.util.Scanner;

public class CH05E01CountUpNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		int negative = 0;
		int positive = 0;
		int total = 0;
		double average = 0;
		
		for(int i = 1; i > 0; i++){
			int number = scan.nextInt();
			if(number==0 && negative==0 && positive==0){
				System.out.println("No numbers entered except 0");
				break;
			}
			else if(number<0){
				++negative;
				total = total + number;
				average = (double)total/(double)i;
			}
			else if(number>0){
				++positive;
				total = total + number;
				average = (double)total/(double)i;
			}
			else if(number==0 && (negative!=0 || positive!=0)){
				System.out.println("The number of positives is: " + positive);
				System.out.println("The number of negatives is: " + negative);
				System.out.println("The total is: " + total);
				System.out.println("The average is: " + average);
				break;
			}
		}

	}

}
