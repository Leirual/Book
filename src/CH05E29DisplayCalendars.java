import java.util.Scanner;

public class CH05E29DisplayCalendars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please state the year");
		int year = scan.nextInt();
		
		System.out.println("Please state what day of the week (from 1 to 7, where monday is 1, and sunday is 7) is the first day of that year");
		int day = scan.nextInt();
		
		String month = "x";
		String monthYear; //variable containing month + year, like "January 2013"
		int monthYearLenght; //variable for adjusting printing to center, depending on the month and year
		int leftDistance; //variable for adjusting printing to center
		int daysInMonth = 0; //variable used for determining number of days in a month
		int currentday = 0; //helpful variable that states in which column we are in
		
		for(int i=1; i<13; i++){
			
			//establishing the name of the month in the loop
			switch(i){
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
			}
			
			//establishing the "center point" to which to center the month and year, and printing out a certain number of blank spaces
			monthYear = month+" "+year;
			monthYearLenght = monthYear.length();
			leftDistance = 18-monthYearLenght/2;
			for(int y=0; y<leftDistance; y++){
				System.out.print(" ");
			}
			
			//printing out the month, year, underlining and day names
			System.out.println(" " + month + " " +year);
			System.out.println("  ___________________________________");
			System.out.println("   Mon  Tue  Wed  Thu  Fri  Sat  Sun ");
			
			//establishing how many days are there in a month
			if(month=="January" || month=="March" || month=="May" || month=="July" || month=="August" || month=="October" || month=="December"){
				daysInMonth = 31;
			}
			else if(month=="April" || month=="June" || month=="September" || month=="November"){
				daysInMonth = 30;
			}
			else if(month=="February"){
				if(year%4==0){
					daysInMonth = 29;
				}
				else{
					daysInMonth = 28;
				}
			}
			
			//printing out days
			for(int z=1; z<daysInMonth+day; z++){
				//leaving blank spaces at the beginning of the month if necessary
				if(z<day){
					System.out.print("     ");
					currentday++;
				}
				//if not necessary, than printing the numbers
				else{
					System.out.printf("%5d", z-day+1);
					currentday++;
					if(z%7 == 0){
						System.out.println("");
						currentday = 0; //we go to the 0 column again
					}
				}
			}
			System.out.println("");
			System.out.println("");
			day = currentday+1; //the next first day of the next month will be the current column + 1
		
		}
	}
}
