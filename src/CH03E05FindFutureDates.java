import java.util.Scanner;

public class CH03E05FindFutureDates {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String today = "";
		String future = "";
		
		while(true){
			System.out.println("Enter today's day as a number between 0 and 6, where 0 is Sunday and 6 is Saturday: ");
			int x = scan.nextInt();
			
			if(0<=x && x<=6){
				switch(x){
				case 0:
					today = "Sunday";
					break;
				case 1:
					today = "Monday";
					break;
				case 2:
					today = "Tuesday";
					break;
				case 3:
					today = "Wednesday";
					break;
				case 4:
					today = "Thursday";
					break;
				case 5:
					today = "Friday";
					break;
				case 6:
					today = "Saturday";
					break;
				default:
				}
			}
			else{
				System.out.println("Wrong number");
				continue;
			}
			
			System.out.println("Enter the number of days elapsed since today: ");
			int y = scan.nextInt();
			int sum = x+y;

			switch(sum%7){
			case 0:
				future = "Sunday";
				break;
			case 1:
				future = "Monday";
				break;
			case 2:
				future = "Tuesday";
				break;
			case 3:
				future = "Wednesday";
				break;
			case 4:
				future = "Thursday";
				break;
			case 5:
				future = "Friday";
				break;
			case 6:
				future = "Saturday";
				break;
			default:
			}

			System.out.println("Today is " + today + " and the future day is " + future);
		}
	}
}
