
public class CH04E06RandomPointsInACircle {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, z1, z2;
		double r = 40;
		
		double angle1 = (Math.random() * 2*Math.PI);
		x1 = r * Math.cos(angle1);
		x2 = r * Math.sin(angle1);
		double angle2 = Math.random() * 2*Math.PI;
		y1 = r * Math.cos(angle2);
		y2 = r * Math.sin(angle2);
		double angle3 = Math.random() * 2*Math.PI;
		z1 = r * Math.cos(angle3);
		z2 = r * Math.sin(angle3);
		
		System.out.printf("%.2f %n", angle1);
		System.out.printf("%.2f , %.2f %n",x1,x2);
		System.out.printf("%.2f %n", angle2);
		System.out.printf("%.2f , %.2f %n", y1,y2);
		System.out.printf("%.2f %n", angle3);
		System.out.printf("%.2f , %.2f %n", z1,z2);
		
		double a1, b1, a2, b2, a3, b3;
		a1 = x1-y1;
		b1 = x2-y2;
		double c1 = Math.sqrt(Math.pow(a1,2) + Math.pow(b1,2));
		a2 = x1-z1;
		b2 = x2-z2;
		double c2 = Math.sqrt(Math.pow(a2,2) + Math.pow(b2,2));
		a3 = y1-z1;
		b3 = y2-z2;
		double c3 = Math.sqrt(Math.pow(a3,2) + Math.pow(b3,2));
		
		double final1 = Math.toDegrees(Math.acos((c1*c1 - c2*c2 - c3*c3) / (-2*c2*c3)));
		double final2 = Math.toDegrees(Math.acos((c2*c2 - c1*c1 - c3*c3) / (-2*c1*c3)));
		double final3 = Math.toDegrees(Math.acos((c3*c3 - c2*c2 - c1*c1) / (-2*c1*c2)));
		System.out.printf("The angles are: %.2f , %.2f , %.2f %n", final1,final2,final3);
		double sum = final1+final2+final3;
		System.out.printf("%.2f", sum);

	}
}
