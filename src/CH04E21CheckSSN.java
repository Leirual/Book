import java.util.Scanner;

public class CH04E21CheckSSN {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter a SSN: ");
			String ssn = scan.nextLine();
			check(ssn);
		}
	}
	
	private static void check(String x){
		
		if(x.length() == 11){
			char one = x.charAt(0);
			char two = x.charAt(1);
			char three = x.charAt(2);
			char four = x.charAt(3);
			char five = x.charAt(4);
			char six = x.charAt(5);
			char seven = x.charAt(6);
			char eight = x.charAt(7);
			char nine = x.charAt(8);
			char ten = x.charAt(9);
			char eleven = x.charAt(10);
			
			if(Character.isDigit(one) && Character.isDigit(two) && Character.isDigit(three) && ((int)four == 45) && Character.isDigit(five)
					 && Character.isDigit(six) && ((int)seven == 45) && Character.isDigit(eight) && Character.isDigit(nine) 
					 && Character.isDigit(ten) && Character.isDigit(eleven)){
				System.out.println(x + " is a correct number.");
			}
			else{
				System.out.println(x + " is an invalid number.");
			}
		}
	}
	
}
