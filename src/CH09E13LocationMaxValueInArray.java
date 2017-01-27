import java.util.Scanner;

import javafx.scene.control.Tab;

public class CH09E13LocationMaxValueInArray {
	
	public static void main(String[] args) {
		
		System.out.println("The goal is to find the largest number in the matrix");
		System.out.println("Enter the number of rows and columns in the main matrix: ");
		Scanner scan = new Scanner(System.in);
		int newRows = scan.nextInt();
		int newColumns = scan.nextInt();
		double[][] tab = new double[newRows][newColumns];
		
		System.out.println("Enter the matix row by row: ");
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab[i].length; j++){
				tab[i][j] = scan.nextInt();
			}
		}
		
		CH09E13Location loc = new CH09E13Location(newRows, newColumns, 0);
		
		System.out.println("The location of the largest element is " + loc.locateLargest(tab).getMaxValue() 
				+ " at (" + loc.locateLargest(tab).getRow() + ", " +  loc.locateLargest(tab).getColumn() + ")");

	}
}


