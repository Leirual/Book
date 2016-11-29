public class CH06E30CrapsSimulation {

	public static void main(String[] args) {

		// launching the main function
		checkCraps();

	}

	// establishing a field, later modifying it only in one of the cases of the first roll
	static int point = 0;

	// the main function
	public static void checkCraps() {
		for (int i = 0; i >= 0; i++) {
			// during the first roll
			if (i == 0) {
				int rollOne = (int) (Math.random() * 6 + 1);
				int rollTwo = (int) (Math.random() * 6 + 1);
				int sum = rollOne + rollTwo;
				System.out.printf("You rolled %d + %d = %d\n", rollOne, rollTwo, sum);

				if (sum == 2 || sum == 3 || sum == 12) {
					System.out.println("You loose");
					break;
				} else if (sum == 7 || sum == 11) {
					System.out.println("You win");
					break;
				} else {
					point = sum;
					System.out.println("Point is: " + point);
				}
			}
			// during every other roll
			else {
				int rollOne = (int) (Math.random() * 6 + 1);
				int rollTwo = (int) (Math.random() * 6 + 1);
				int sum = rollOne + rollTwo;
				System.out.printf("You rolled %d + %d = %d\n", rollOne, rollTwo, sum);

				if (sum == 7) {
					System.out.println("You loose");
					break;
				} else if (sum == point) {
					System.out.println("You win");
					break;
				}
			}
		}
	}
}
