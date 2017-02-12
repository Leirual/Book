import java.util.Scanner;

public class CH10E12Traingle2D {

	public static void main(String[] args) {

		CH10E12Traingle2D t1 = new CH10E12Traingle2D();
		System.out.println(t1.getArea());
		System.out.println(t1.getPerimeter());

		CH10E12Traingle2D t2 = new CH10E12Traingle2D(0, 0, 1, 0, 4, 4);
		System.out.println(t2.getArea());
		System.out.println(t2.getPerimeter());
		
		System.out.println("Input coordinates of a point to check if it's inside the triangle");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		CH10E04MyPoint pointA = new CH10E04MyPoint(x,y);
		
		System.out.print("The stated point ("+pointA.x+","+pointA.y+") is ");
		if(t1.contains(pointA) == true){
			System.out.println(" inside the triangle");
		}
		else{
			System.out.println(" outside the triangle");
		}
		
		System.out.print("The stated point ("+pointA.x+","+pointA.y+") is ");
		if(t2.contains(pointA) == true){
			System.out.println(" inside the triangle");
		}
		else{
			System.out.println(" outside the triangle");
		}
	}

	// creating three "point" objects
	public CH10E04MyPoint p1 = new CH10E04MyPoint(); // objects have to have their constructors ready
	public CH10E04MyPoint p2 = new CH10E04MyPoint();
	public CH10E04MyPoint p3 = new CH10E04MyPoint();

	public CH10E04MyPoint getP1() {
		return p1;
	}

	public CH10E04MyPoint getP2() {
		return p2;
	}

	public CH10E04MyPoint getP3() {
		return p3;
	}

	public void setP1(double p1x, double p1y) {
		p1.setX(p1x);
		p1.setY(p1y);
	}

	public void setP2(double p2x, double p2y) {
		p2.setX(p2x);
		p2.setY(p2y);
	}

	public void setP3(double p3x, double p3y) {
		p3.setX(p3x);
		p3.setY(p3y);
	}

	public CH10E12Traingle2D() {	// no arg triangle constructor
		setP1(0, 0);
		setP2(1, 1);
		setP3(2, 5);
	}

	public CH10E12Traingle2D(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {	// basic triangle constructor
		this.p1.x = p1x;
		this.p1.y = p1y;
		this.p2.x = p2x;
		this.p2.y = p2y;
		this.p3.x = p3x;
		this.p3.y = p3y;
	}

	public double getArea() {	// method calculating the triangle's area
		CH10E04MyPoint p1 = getP1();
		CH10E04MyPoint p2 = getP2();
		CH10E04MyPoint p3 = getP3();
		double area = Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2);
		return area;
	}

	public double getPerimeter() {	// method calculating the triangle's perimeter
		CH10E04MyPoint p1 = getP1();
		CH10E04MyPoint p2 = getP2();
		CH10E04MyPoint p3 = getP3();
		double perimeter = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2))
				+ Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2))
				+ Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
		return perimeter;
	}
	
	public boolean contains(CH10E04MyPoint p){	// method calculating if a point is inside the specific triangle
		double alpha = ((p2.y - p3.y)*(p.x - p3.x) + (p3.x - p2.x)*(p.y - p3.y)) /
		        ((p2.y - p3.y)*(p1.x - p3.x) + (p3.x - p2.x)*(p1.y - p3.y));
		double beta = ((p3.y - p1.y)*(p.x - p3.x) + (p1.x - p3.x)*(p.y - p3.y)) /
		       ((p2.y - p3.y)*(p1.x - p3.x) + (p3.x - p2.x)*(p1.y - p3.y));
		double gamma = 1.0f - alpha - beta;
		if(alpha>=0 && beta>=0 && gamma>=0){
			return true;
		}
		else{
			return false;
		}
	}
}
