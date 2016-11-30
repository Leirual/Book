import java.util.Scanner;

public class CH07E12ReverseAnArray {

	public static double[] reverseArray = new double[10];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.println("Enter 10 numbers");
		for(int i=0; i<array.length; i++){
			array[i] = scan.nextDouble();
		}
		
		reverse(array);
		
		for(int i=0; i<reverseArray.length; i++){
			System.out.print(reverseArray[i] + " ");
		}
	}

	public static double[] reverse(double[] array){
		for(int i=0; i<reverseArray.length; i++){
			reverseArray[i] = array[array.length-1-i];
		}
		return reverseArray;
	}
}
