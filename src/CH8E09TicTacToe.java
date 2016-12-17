import java.util.Scanner;

public class CH8E09TicTacToe {

	public static void main(String[] args) {
		
		String tab[][] = new String[3][3];
		String player = "O";
		Scanner scan = new Scanner(System.in);
		
		// first printout of the grid
		for(int i=0; i<tab.length; i++){
			System.out.println("-------");
			System.out.print("|");
			for(int j=0;j<tab[i].length; j++){
				if(tab[i][j] == null){
					System.out.print(" |");
				}
				else{
					System.out.print(tab[i][j] + "|");
				}
			}
			System.out.println();
		}
		System.out.println("-------");
		
		
		while(true){
			// input coordinates for sign
			System.out.println("Enter a row (0, 1, 2) for player " + player +": ");
			int row = scan.nextInt();
			System.out.println("Enter a column (0, 1, 2) for player " + player +": ");
			int column = scan.nextInt();
			
			// check if space is taken - if not then input symbol
			if(tab[row][column] == null){
				tab[row][column] = player;
			}
			else{
				System.out.println("This space is already taken");
				continue;
			}
			
			// printout current board state
			for(int i=0; i<tab.length; i++){
				System.out.println("-------");
				System.out.print("|");
				for(int j=0;j<tab[i].length; j++){
					if(tab[i][j] == null){
						System.out.print(" |");
					}
					else{
						System.out.print(tab[i][j] + "|");
					}
				}
				System.out.println();
			}
			System.out.println("-------");
			
			// win conditions
			if((tab[0][0] == tab[1][1] && tab[0][0] == tab[2][2] && tab[0][0] != null) ||
					(tab[2][0] == tab[1][1] && tab[2][0] == tab[0][2] && tab[2][0] != null) ||
					(tab[0][0] == tab[0][1] && tab[0][0] == tab[0][2] && tab[0][0] != null) ||
					(tab[1][0] == tab[1][1] && tab[1][0] == tab[1][2] && tab[1][0] != null) ||
					(tab[2][0] == tab[2][1] && tab[2][0] == tab[2][2] && tab[2][0] != null) ||
					(tab[0][0] == tab[1][0] && tab[0][0] == tab[2][0] && tab[0][0] != null) ||
					(tab[0][1] == tab[1][1] && tab[0][1] == tab[2][1] && tab[0][1] != null) ||
					(tab[0][2] == tab[1][2] && tab[0][2] == tab[2][2] && tab[0][2] != null)	){
				System.out.println("Player " + player + " won!");
				break;
			}
			
			// change player
			if(player.equals("X")){
				player = "O";
			}
			else if(player.equals("O")){
				player = "X";
			}
		}
	}
}
