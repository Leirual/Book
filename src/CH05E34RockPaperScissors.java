import java.util.Scanner;

public class CH05E34RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myWin = 0;
		int PCWin = 0;
		int PCChoice = 0;
		boolean x = true;
		
		while(x==true){
			System.out.println("Please choose and write one of the following: rock , paper or scissors");
			String myChoice = scan.nextLine();
			
			//making sure the input is correct
			if(myChoice.equals("rock") || myChoice.equals("paper") || myChoice.equals("scissors")){
				System.out.println("You've chosen " + myChoice);
			}
			else{
				System.out.println(myChoice + " is a wrong input. Try again");
				continue;
			}
			
			//random PC choice
			PCChoice = (int)(Math.random()*3 + 1);
			String PCChoiceString = "";
			switch(PCChoice){
			case 1:
				PCChoiceString = "rock";
				break;
			case 2:
				PCChoiceString = "paper";
				break;
			case 3:
				PCChoiceString = "scissors";
				break;
			}
			System.out.println("The PC has chosen " + PCChoiceString);
			
			//comparing the choices and adding wins
			if(PCChoiceString.equals("rock") && myChoice.equals("scissors")){
				System.out.println("You loose");
				PCWin++;
			}
			else if(PCChoiceString.equals("paper") && myChoice.equals("rock")){
				System.out.println("You loose");
				PCWin++;
			}
			else if(PCChoiceString.equals("scissors") && myChoice.equals("paper")){
				System.out.println("You loose");
				PCWin++;
			}
			else if(myChoice.equals("rock") && PCChoiceString.equals("scissors")){
				System.out.println("You win");
				myWin++;
			}
			else if(myChoice.equals("paper") && PCChoiceString.equals("rock")){
				System.out.println("You win");
				myWin++;
			}
			else if(myChoice.equals("scissors") && PCChoiceString.equals("paper")){
				System.out.println("You win");
				myWin++;
			}
			else{
				System.out.println("It's a tie!");
			}
			
			//if someone has a 2 win advantage - end the game
			if(myWin>=(PCWin+2)){
				System.out.println("You win the game!");
				x=false;
			}
			else if(PCWin>=(myWin+2)){
				System.out.println("You loose the game!");
				x=false;
			}
		}
	}
}
