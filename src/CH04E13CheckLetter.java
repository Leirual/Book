import java.util.Scanner;

public class CH04E13CheckLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
		System.out.println("Enter a letter: ");
				
		String letter = scan.nextLine();
		char check = letter.charAt(0);
		
		if(Character.isLetter(check)){
			switch((int)Character.toUpperCase(check)){
			case 65:
				System.out.println(check + " is a vowel.");
				break;
			case 69:
				System.out.println(check + " is a vowel.");
				break;
			case 73:
				System.out.println(check + " is a vowel.");
				break;
			case 79:
				System.out.println(check + " is a vowel.");
				break;	
			case 85:
				System.out.println(check + " is a vowel.");
				break;	
			default:
				System.out.println(check + " is a consonant.");
				break;
			}
		}
		else{
			System.out.println(check + " is not a letter.");
		}
		}

	}

}
