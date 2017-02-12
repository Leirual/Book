import java.util.Date;

public class StrangeCastingError {
	
	public static void main(String[] args){
	
		Object fruit = new Fruit();		// Object fruit is really of a type Fruit
		Object apple = (Apple)fruit;	// Object apple want's to be the fruit (Fruit type) cast into Apple (so basically an Apple type)

	
	}
}

class Apple extends Fruit{
	public Apple(){
		System.out.println("I'm an apple");
	}
}

class Fruit{
	public Fruit(){
		System.out.println("I'm a fruit");
	}
}


