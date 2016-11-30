import java.util.Scanner;

public class CH07E18BubbleSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] array = new double[10];
		
		// populating basic array
		System.out.println("Enter 10 numbers");
		for(int i=0; i<array.length; i++){
			array[i] = scan.nextDouble();
		}

		sort(array);
		
		System.out.print("The reverse array is: ");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}

	}
	// the sorting method
	public static double[] sort(double array[]){
		// the loop variable depends on the sub loop - it will reset each time it finds that x is bigger than x+1
		for (int x = 0; x < array.length - 1;) {
			if (array[x] > array[x + 1]) {
				double temp = array[x];
				array[x] = array[x+1];
				array[x+1] = temp;
				x=0;
			}else {
				x++;
			}
		}
		return array;
	}
}
