import java.lang.reflect.Field;

public class CH09E09RegularPolygon {

	public static void main(String[] args) {

		RegularPolygon polygon1 = new RegularPolygon();
		System.out.println("The perimiter of the first polygon is: " + polygon1.getPerimeter() + ", and the area is: "+ polygon1.getArea());
		
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		System.out.println("The perimiter of the second polygon is: " + polygon2.getPerimeter() + ", and the area is: "+ polygon2.getArea());
		
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The perimiter of the third polygon is: " + polygon3.getPerimeter() + ", and the area is: "+ polygon3.getArea());
		
		System.out.printf("%d %f\n", polygon1.getN(), polygon1.getSide());
		System.out.printf("%d %f\n", polygon2.getN(), polygon2.getSide());
		System.out.printf("%d %f\n", polygon3.getN(), polygon3.getSide());
		
		
		Class myClass = null;

		try {
		    myClass = Class.forName("RegularPolygon");
		    Field[] fields = myClass.getDeclaredFields();

		    for (Field field : fields) {
		         System.out.println("Field type is: " + field.getType());
		         System.out.println("Field name is: " + field.getName());
		         System.out.println("Field value is: " + field);
		    }
		} catch (Exception e) {
		}
	}
}

class RegularPolygon {
	
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon() {
	}

	RegularPolygon(int number, double size) {
		setN(number);
		setSide(size);
	}

	RegularPolygon(int number, double size, double coordx, double coordy) {
		setN(number);
		setSide(size);
		setX(coordx);
		setY(coordy);
	}

	public double getPerimeter() {
		return getN() * getSide();
	}

	public double getArea() {
		return (getN() * Math.sqrt(getSide())) / (4 * Math.tan(Math.PI / getN()));
	}

	public int getN() {
		return n;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	public void setN(int n) {
		this.n = n;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}

}
