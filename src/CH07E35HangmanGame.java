import java.util.Scanner;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class CH07E35HangmanGame {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;
		
		//Add any words you wish to this array
		String[] words = {"cats", "caty", "caca", "croc"};
		
		while(repeat == true){
			int mistakes = 0;
			int x = (int)(Math.random()*words.length);			// choose a random word
			String word = words[x];			
			char[] wordLetters = word.toCharArray();			// transform the word into a letter array
			char[] wordAsterisk = new char[wordLetters.length];	// create a new asterisk array of the same length as the word
			
			for(int z=0; z<wordAsterisk.length; z++){			// fill the array with asterisks
				wordAsterisk[z] = '*';
				System.out.print(wordAsterisk[z]);
			}
			
			System.out.println();

				for(int z=0; z<wordAsterisk.length; z++){		// for each character in the wordAsterisk array
					if(wordAsterisk[z] == '*'){					// if the character is still an asterisk
						System.out.println();
						System.out.println("Enter a letter in word");
						String letter = scan.nextLine();
						char[] letterCharacter = letter.toCharArray();	// create an array of the letter given
						
						int i = 0;	// assisting variable
						int notIt = 0; // adding up if the given letter isn't a correct letter
						for(int y=0; y<wordAsterisk.length; y++){	// for each character in the word array
							// if it's in the wordAsterisk array
							if(wordAsterisk[y] == letterCharacter[0]){
								System.out.print(letterCharacter[0] + " is already in the word");
								i=1;
								break;
							}
							// if it's correct and wasn't previously in the wordAsterisk array
							else if((wordLetters[y] == letterCharacter[0]) && (wordAsterisk[y] != letterCharacter[0])){	// if the character equals the letter given
								wordAsterisk[y] = letterCharacter[0];	// input it into the asterisk array
							}
							// if it's wrong
							else{
								notIt++;
							}
							// if the letter given isn't in the word
							if(notIt==wordAsterisk.length){
								mistakes++;
								System.out.print(letterCharacter[0] + " is not in the word");
								i=1;
							}
						}
						// if there was a letter added
						if(i!=1){
							for(int y=0; y<wordAsterisk.length; y++){
								System.out.print(wordAsterisk[y]);
							}
						}
						// return to the beginning of the word and check again for asterisks
						z=0;
					}
				}
			// if there are no more asterisk
			System.out.println();
			System.out.println("You've done it!");
			System.out.println("You've made " + mistakes + " mistakes");
			System.out.println("Do you want to guess another word? Enter y or n");
			String input = scan.nextLine();
			if ("y".equals(input)){
				repeat = true;
			}
			else{ 
				repeat = false;
			}
		}
	}
}

