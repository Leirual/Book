import java.util.Scanner;

public class CH07E21BeanMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of balls to drop: ");
		int balls = scan.nextInt();
		
		System.out.println("Enter the number of slots in the bean machine: ");
		int slots = scan.nextInt();
		
		int[] slotsTable = new int[slots];
		
		// for each falling ball
		for(int i=0; i<balls; i++){
			String directions = "";					// create a field to write in the ball's directions
			int right = 0;							// create a field to check how many right turns will occur
			for(int j=0; j<slots-1; j++){			// the ball can turn a number of times equal to slots-1
				double numWay = Math.random();		// randomize the course of the ball
				if(numWay<0.5){						// modify the directions field depending on the course
					directions = directions + "R";
					right++;
				}
				else{
					directions = directions + "L";
				}			
			}
			slotsTable[right]++;					// add a ball to a certain slot - depending on the number of right turns 
			
			System.out.println(directions);
		}
		
		// establishing what is the maximum number of balls in a single slot
		int max = 0;
		for(int x=0; x<slotsTable.length; x++){
			if(slotsTable[x]>max){
				max = slotsTable[x];
			}
		}
		System.out.println();
		
		// using the maximum number of balls to print out a visual of the outcome
		for(int z=max; z>0; z--){
			for(int y=0; y<slotsTable.length; y++){
				if(slotsTable[y] >= z){
					System.out.print("O");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
