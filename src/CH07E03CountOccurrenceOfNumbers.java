import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CH07E03CountOccurrenceOfNumbers {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		// populate the list with integers
		System.out.println("Enter integers between 1 and 100. 0 ends the input.");
		for (int i = 0; i >= 0; i++) {
			int number = scan.nextInt();
			list.add(number);
			// ending list if input is 0 (and removing that 0 from the list)
			if (number == 0) {
				list.remove(i);
				break;
			}
		}
		// sorting the integers from lowest to highest
		Collections.sort(list);

		// main loop for printing occurrences
		for (int i = 0; i < list.size(); i++) {
			int occurrence = 0; // for counting up occurrences
			boolean repeat = false; // for checking if the number in question was already printed out with its number of occurrences
			String howMany = ""; // for changing the output string depending on number of occurrences 
			// counting occurrences of the current number in the list
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					occurrence++;
				}
			}
			// checking if there was a number equal to the current one previously in the loop;
			for (int x = 0; x < i; x++) {
				if (list.get(i) == list.get(x)) {
					repeat = true;
				}
			}
			// if there was, we skip the outprint of occurrences for that number (because it was printed the first time for that particular number)
			if (repeat == true) {
				continue;
			}
			if (occurrence == 1) {
				howMany = " time.";
			} else {
				howMany = " times.";
			}
			System.out.println(list.get(i) + " occurs " + occurrence + howMany);
		}
	}
}
