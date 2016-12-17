import sun.util.resources.cldr.ur.CurrencyNames_ur;

public class CH08E04WeeklyHoursOfEmplyees {

	public static void main(String[] args) {

		int[][] schedule = new int[8][7];
		
		// array creation
		for(int row = 0; row<schedule.length; row++){
			for(int column = 0; column<schedule[row].length; column++){
				schedule[row][column] = (int)(Math.random() *8+1);
			}
		}
		
		int previousTotal = 0;
		int currentTotal = 0;
		
		// first printout
		for(int row = -1; row<schedule.length; row++){
			if(row==-1){
				String days = "M Tu We Th Fr Sa Su\n";
				System.out.printf("%15s%s","", days);
			}
			else{
				for(int column = -1; column<schedule[row].length; column++){
					if(column==-1){
						System.out.print("Employee " + row + "   ");
					}
					else{
						System.out.printf("  " + schedule[row][column]);
						currentTotal += schedule[row][column];
					}
					if(column==schedule[row].length-1){
						System.out.print("    " + currentTotal);
						System.out.println();
					}
				}
			}
			currentTotal = 0;
		}
		
		// establishing values from first row
		for(int row = 0; row<1; row++){
			for(int column = 0; column<schedule[row].length; column++){
				currentTotal += schedule[row][column];
			}
		}
		int cache = 0;
		cache = currentTotal;
		currentTotal = 0;
		previousTotal = cache;
		
		// mixing-up the array
		for(int row = 1; row<schedule.length; row++){
			for(int column = 0; column<schedule[row].length; column++){
				currentTotal += schedule[row][column];
			}
			for(int column = 0; column<schedule[row-1].length; column++){
				previousTotal += schedule[row-1][column];
			}
			if(currentTotal > previousTotal){
				int[] hoursOrder = new int[8];
				hoursOrder = schedule[row-1];
				schedule[row-1] = schedule[row];
				schedule[row] = hoursOrder;
				previousTotal = currentTotal;
				row = 0;
			}
			currentTotal = 0;
			previousTotal = 0;
		}
		
		// printout after mix-up
		for(int row = -1; row<schedule.length; row++){
			if(row==-1){
				String days = "M Tu We Th Fr Sa Su\n";
				System.out.printf("%15s%s","", days);
			}
			else{
				for(int column = -1; column<schedule[row].length; column++){
					if(column==-1){
						System.out.print("Employee " + row + "   ");
					}
					else{
						System.out.printf("  " + schedule[row][column]);
						currentTotal += schedule[row][column];
					}
					if(column==schedule[row].length-1){
						System.out.print("    " + currentTotal);
						System.out.println();
					}
				}
			}
			currentTotal = 0;
		}
	}
}
