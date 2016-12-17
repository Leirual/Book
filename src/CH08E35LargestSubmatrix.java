import java.util.Scanner;

public class CH08E35LargestSubmatrix {

	public static void main(String[] args) {
		
		System.out.println("The goal is to find the largest square \"sumbatrix\" of only 1's, inside a spicified square matrix of 1's and 0's");
		System.out.println("Enter the number of rows in the main matrix: ");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int tab[][] = new int[rows][rows];
		
		
		System.out.println("Enter the matix row by row: ");
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab[i].length; j++){
				tab[i][j] = scan.nextInt();
			}
		}
		
		findLargestBlock(tab);
		System.out.printf("The maximum submatrix is at (%d, %d) with size %d", answer[1],answer[2],answer[0]);
		
	}

	public static int answer[] = new int[3];
	
	public static int[] findLargestBlock(int[][] m){
		
		int myRows = m.length;
		int biggestLenghtEver = 0;
		int biggestStartColumn = 0;
		int biggestStartRow = 0;
		
		// searching the whole array
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				
				int onesInPreviousRow = m.length;
				int maximumNumberOfOnesInRow = 0;
				int row = 0;
				int countOnes = 0;
				
				if(m[i][j] == 1){
					for(int x=i; x<myRows; x++){
						countOnes = 0;
						for(int y=j; y<m[i].length; y++){
							if(m[x][y] == 1){
								countOnes++;
							}
							else if(m[x][y] == 0){								
								break;
							}
							if(countOnes == onesInPreviousRow){
								break;
							}
						}
						
						row++;
						if(countOnes<onesInPreviousRow){
							maximumNumberOfOnesInRow = countOnes;
						}
						else{
							maximumNumberOfOnesInRow = onesInPreviousRow;
						}
						
						if(countOnes<row){
							if(biggestLenghtEver < maximumNumberOfOnesInRow){
								biggestLenghtEver = maximumNumberOfOnesInRow;
								biggestStartColumn = j;
								biggestStartRow = i;
							}
							break;
						}
						
						else if(countOnes==row){
							if(biggestLenghtEver < maximumNumberOfOnesInRow){
								biggestLenghtEver = maximumNumberOfOnesInRow;
								biggestStartColumn = j;
								biggestStartRow = i;
							}
							break;
						}
						
						if(maximumNumberOfOnesInRow == row){
							if(biggestLenghtEver < maximumNumberOfOnesInRow){
								biggestLenghtEver = maximumNumberOfOnesInRow;
								biggestStartColumn = j;
								biggestStartRow = i;
							}
							break;
						}

						onesInPreviousRow = countOnes;
					}
				}
			}
		}

		answer[0] = biggestLenghtEver;
		answer[1] = biggestStartColumn;
		answer[2] = biggestStartRow;
		return answer;
	}
}
			
