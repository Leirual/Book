import java.util.Scanner;

public class CH07E21BeanMachinev2 {

	static int balls;
	static int slots;
	static int[] slotsTable;
	static int max;
	
	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of balls to drop: ");
			balls = scan.nextInt();
			System.out.println("Enter the number of slots in the bean machine: ");
			slots = scan.nextInt();
			slotsTable = new int[slots];

			ballTurns(balls);
			setMax(slotsTable);
			System.out.println();
			printOutVisual(max);
		}
	}
	
	// for each falling ball, we establish it's directions, and finally add it to a specific slot at the bottom
	public static void ballTurns(int balls){
		for (int i = 0; i < balls; i++) {
			String directions = ""; // create a field to write in the ball's directions
			int right = 0; // create a field to check how many right turns will occur
			for (int j = 0; j < slots - 1; j++) { // the ball can turn a number of times equal to slots-1
				double numWay = Math.random(); // randomize the course of the ball
				if (numWay < 0.5) { // modify the directions field depending on the course
					directions = directions + "R";
					right++;
				} else {
					directions = directions + "L";
				}
			}
			slotsTable[right]++; // add a ball to a certain slot - depending on the number of right turns
			System.out.println(directions);
		}
	}
	
	// establishing what is the maximum number of balls in a single slot
	public static int setMax(int[] table){
		max = 0;
		for(int x=0; x<table.length; x++){
			if(table[x]>max){
				max = table[x];
			}
		}
		return max;
	}
	
	// using the maximum number of balls to print out a visual of the outcome
	public static void printOutVisual(int max){
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
