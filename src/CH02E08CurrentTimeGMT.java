import java.util.Scanner;

public class CH02E08CurrentTimeGMT {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		
		while(true){
			long totalMilis = System.currentTimeMillis();
			long totalSeconds = totalMilis / 1000;
			long currentSeconds = totalSeconds % 60;
			long totalMinutes = totalSeconds / 60;
			long currentMinutes = totalMinutes % 60;
			long totalHours = totalMinutes / 60;
			long currentHours = totalHours % 24;
			
			System.out.println("Please input the GMT time difference:");
			int time = scan.nextInt();
		
			long yourHour = currentHours + time;
			
			System.out.printf("The current time is: %d:%d:%d" + '\n', yourHour, currentMinutes, currentSeconds);
			
			Thread.sleep(1000);
		}
	}
}
