
public class CH10E04MyPoint {

	public static void main(String[] args) {

		CH10E04MyPoint pointA = new CH10E04MyPoint(1, 2);
		CH10E04MyPoint pointB = new CH10E04MyPoint(39, 2);

		System.out.println(distance(pointA, pointB));
		System.out.println(pointA.distance(25, 2));
	}

	public double x;
	public double y;

	public double getX() {		// gets the X coordinate
		return x;
	}

	public double getY() {		// gets the Y coordinate
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public CH10E04MyPoint() {	// no arg constructor
		x = 0;
		y = 0;
	}

	public CH10E04MyPoint(double x, double y) {	// basic constructor
		this.x = x;
		this.y = y;
	}

	public static double distance(CH10E04MyPoint a, CH10E04MyPoint b) {	// a static method that determines the distance between 2 points
		double aOne = a.getX();
		double aTwo = a.getY();
		double bOne = b.getX();
		double bTwo = b.getY();

		double dist = Math.sqrt(Math.pow(bOne - aOne, 2) + Math.pow(bTwo - aTwo, 2));

		return dist;
	}

	public double distance(double x, double y) {	// a standard method the determines distance between an existing point and a new one
		double aOne = getX();
		double aTwo = getY();

		double dist = Math.sqrt(Math.pow(x - aOne, 2) + Math.pow(y - aTwo, 2));

		return dist;
	}
}
