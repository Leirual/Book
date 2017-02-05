import java.util.Date;

public class Test {
	
	private String text;
	public Test(String s){
		text = s;
	}
	
	public static void main(String[] args){
		Test test = new Test("ABC");
		System.out.println(test.text.toLowerCase());
	
		
	}
}


