package oca;

public class TestInheritance {
	/*
	 * instanceof returs true if the reference varibale being tested is of the type
	 * being compared to
	 */
	/*
	 * create inheritance relationship in java by extending a class or implements
	 * Interface
	 * 
	 */
	/*
	 * the most reason to use inheritance is: to promote code reuse to use
	 * polymorphism
	 */
	/*
	 * when class b extend class A extends instance variable, static variables
	 * ,static methods,abstract methods, can be extended constructor and
	 * Initialization blocks
	 * 
	 * class B implements Interface I extends only constants ,abstract methods
	 * ,default methods,access(inherited no) only static methods
	 */
	/*
	 * IS-A means this thing is a type of that thing
	 */
}

/*
 * Example of instanceof
 */
class Test {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		if (t1 instanceof Object) // downcast
			System.out.println("t1's is Object ");
		Bmw bmw = new Bmw("java");
		if (bmw instanceof Car)
			System.out.println("bmw's is a car ");

		/*
		 * 
		 */

	}
}

class Car {
	public static int x;
	public String y;

	public Car(String y) {
		super();
		this.y = y;
	}

	// public abstract void goAbstractMethod();// abstract Method

	public void exampleInstanceMethod() {
	}; // instance Method

	public static void exampleStaticMethod() {
	};// static method

	static {
		System.out.println("this is a bloc");// Initialization blocks
	};
	{
		System.out.println("this is Initialization Block");
	};
}

class Bmw extends Car {
	public Bmw(String y) {
		super(y);
		// TODO Auto-generated constructor stub
	}

	/*
	 * can not extends constructor can not extends Initialization blocks
	 */
	/*
	 * @Override public void goAbstractMethod() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}

class GameShape {
	public void displayShape() {
		System.out.println("displaying shape");
	}
}

class PlayerPiece extends GameShape {
	public void movePiece() {
		System.out.println("moving game piece");
	}

	@Override
	public void displayShape() {
		System.out.println("this override of display shape method");
	}
}

class TitePiece extends GameShape {
	public void getAdjacent() {
		System.out.println("getting adjacent tiles");
	}
}

class TestShapes {
	public static void main(String[] args) {
		PlayerPiece playerPiece = new PlayerPiece();
		TitePiece titlePiece = new TitePiece();
		playerPiece.displayShape();
		playerPiece.movePiece();
		titlePiece.displayShape();
		titlePiece.getAdjacent();
		System.out.println("-------------------------------------");
		GameShape gameShape = new TitePiece();
		gameShape.displayShape();
		System.out.println("------------------------------------");
		GameShape gameShape2 = new PlayerPiece();
		gameShape2.displayShape();

	}
}

class Vehicle {
}

class CarTest extends Vehicle {
	/*
	 * CarTest IS-A Vehicle
	 */
}

class Subaru extends CarTest {
	/*
	 * Subaru IS-A CarTest Subaru IS-A Vehicle Subaru is a Subclass of both Vehicle
	 * and CarTest
	 * 
	 */
}

class LeadRope {
}

class Animal {
}

class Horse extends Animal {
	private Halter halter=new Halter();

	/*
	 * Horse IS-A Animal Horse HAS-A Halter(because Horse declares an instance
	 * varibale of type Halter
	 */
	public void tie(LeadRope lead) {
		/*
		 * call tie method of Halter class
		 */
		halter.tie(lead);
	}
}

class Halter {
	public void tie(LeadRope leadRope) {
		// Do The actual tie work here
	}
}