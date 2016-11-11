
public class CH04E25VechiclePlateNumber {

	public static void main(String[] args) {
		
		//plate numbers
		char one = (char)(Math.random()*10 + 48);
		System.out.println(one);
		char two = (char)(Math.random()*10 + 48);
		System.out.println(two);
		char three = (char)(Math.random()*10 + 48);
		System.out.println(three);
		
		//plate letters
		char four = (char)(Math.random()*26 + 65);
		System.out.println(four);
		char five = (char)(Math.random()*26 + 65);
		System.out.println(five);
		char six = (char)(Math.random()*26 + 65);
		System.out.println(six);
		char seven = (char)(Math.random()*26 + 65);
		System.out.println(seven);
		
		System.out.println(""+one+two+three+four+five+six+seven);
		System.out.printf("%c%c%c%c%c%c%c\n", one,two,three,four,five,six,seven);
		
	}

}
