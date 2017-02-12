import java.util.Date;

public class Test {
	
	private double radius;
	
	public Test(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}

}

class B extends Test{
	private double length;
	
	public B(double radius, double length){
		super(radius);
		this.length = length;
	}
	
	@Override
	public double getArea(){
		return getArea() * length;
	}
	
	
	
	
}


