import java.util.Scanner;

public class CH06E18CheckPasswordMethod {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Please input a new password.");
			String password = scan.nextLine();
			if(checkPassword(password)==false){
				System.out.println("Invalid Password");
				System.out.println("The password must contain at least 8 characters");
				System.out.println("The password must contain at least 2 numbers");
				System.out.println("The password must contain only letters and numbers");
			}
			else{
				System.out.println("Valid Password");
				break;
			}
		}
	}

	public static boolean checkPassword(String password){
		//check if it's too short
		if(password.length()<8){
			return false;
		}
		//check if it has less than 2 numbers
		int numCharCount = 0;
		for(int i=0; i<password.length(); i++){
			char character = password.charAt(i);
			if(character>=48 && character<=57){
				numCharCount++;
			}
		}
		if(numCharCount<2){
			return false;
		}
		//check if it has any other characters besides numbers and letters
		for(int i=0; i<password.length(); i++){
			char character = password.charAt(i);
			if(character<48 || (character>57 && character<65) || (character>90 && character<97) || character>122){
				return false;
			}
		}
		//if not, than
		return true;
	}
}
