import java.util.Scanner;

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
		
		System.out.println("The location of the largest element is " + Location.locateLargest(tab).getMaxValue() 
				+ " at (" + Location.locateLargest(tab).getRow() + ", " +  Location.locateLargest(tab).getColumn() + ")");

	}
}

class Location{
	public static int row;
	public static int column;
	public static double maxValue;
	public static int[][] coord = new int[row][column];
	
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public double getMaxValue() {
		return maxValue;
	}

	public Location(int r, int c, double m){
		r = getRow();
		c = getColumn();
		m = getMaxValue();
	}

	public static Location locateLargest(double[][] a){		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(a[i][j] > maxValue){
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		Location loc = new Location(row, column, maxValue);
		return loc;
	}
}
