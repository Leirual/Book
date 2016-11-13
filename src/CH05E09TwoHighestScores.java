import java.util.Scanner;

public class CH05E09TwoHighestScores {

	public static void main(String[] args) {

		Scanner scanStudents = new Scanner(System.in);
		Scanner scanName = new Scanner(System.in);
		Scanner scanScore = new Scanner(System.in);

		System.out.println("Please state the number of students: ");

		int x = scanStudents.nextInt();
		int topScore = 0;
		String topName = "X";
		int secondScore = 0;
		String secondName = "Y";

		for (int i = 1; i <= x; i++) {
			System.out.println("State the " + i + " student's name: ");
			String name = scanName.nextLine();
			if (name != null) {
				System.out.println("State the " + i + " student's score: ");
				int score = scanScore.nextInt();

				if ((score > secondScore) && (score < topScore)) {
					secondScore = score;
					secondName = name;
				} else if (score > topScore) {
					topScore = score;
					topName = name;
				}
			}
		}

		System.out.println("The student with the highest score is " + topName + " with a score of " + topScore);
		System.out.println("The student with the second highest score is " + secondName + " with a score of " + secondScore);

	}

}
