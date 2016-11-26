
public class CH05E23NumberCancellationErrors {

	public static void main(String[] args) {
		//exercise for checking how to add small numbers so that the cancellation errors are small or none at all
		
		float sum1 = 0;
		float sum2 = 0;

		for (int i = 1; i <= 50000; i++) {
			sum1 = sum1 + (1 / (float) i);
		}
		System.out.println(sum1);
		//more cancellation errors after adding from biggest to smallest
		
		
		for (int i = 0; i < 50000; i++) {
			sum2 = sum2 + (1 / (float) (50000 - i));
		}
		System.out.println(sum2);
		//less cancellation errors after adding from smallest to biggest

	}
}
