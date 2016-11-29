import java.util.Scanner;

public class CH06E03PalindromeMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is a palindrome");
		int number = scan.nextInt();
		
		reverse(number);
		System.out.println("The reverse number is: " + rev);
		
		if(isPalindrome(number) == true){
			System.out.println("The number is a palindrome");
		}
		else{
			System.out.println("The number is not a palindrome");
		}	
	}
	
	static int help;
	static int rev;
	
	//function for reversing any given int
	public static int reverse(int number){
		while (number > 0)
		 {
		      help = number % 10;
		      rev = rev * 10 + help;
		      number = number / 10;
		 }
		return rev;
	}
	
	//the function could be void, and the if/else statements in main could go in here, but the exercise states to write it as boolean method
	public static boolean isPalindrome(int number){
		if(number == rev){
			return true;
		}
		else{
			return false;
		}
	}
}
