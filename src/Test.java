import java.util.Date;

public class Test {

	public static void main(String[] args) {

		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
		BMI bmi2 = new BMI("Susan King", 177, 77);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
		
		java.math.BigInteger x = new java.math.BigInteger("3");
		java.math.BigInteger y = new java.math.BigInteger("7");
		java.math.BigInteger z = x.add(y);
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("z is " + z);
		
		
	}
}


