package testOca;

public class ImplementingInterface {
	/*
	 * use abstract an Interface we agreeing to provide legal implementations for
	 * every abstract method defined in the interface
	 *  a nonabstract implementation class must do the following: 1.provide concrete (nonabstract) implementation
	 * for all abstract methods from the declared interface class can be implements
	 * many interfaces interface can be extends many interfaces on java class not
	 * cannot extends many class (multiple heritance not allowed in java) 
	 * first concrete class must be implement all abstract to class or interface
	 */
	public static void main(String[] args) {
		new MultInt().go();

	}
}

interface x {
	void methodTest();

	int x = 12;

	static void methodTest2() {
		System.out.println("static method ");
	}

	default void methodTest3() {
		System.out.println("default ");
	}
}

class B implements x {

	@Override
	public void methodTest() {
		// TODO Auto-generated method stub

	}

}

interface Bounceable {
	void bounce();

	void setBounceFactory(int bf);
}
abstract class Billet{
	
	abstract void getBillet();
	
}

/*
 * class Tire is the first concrete class must be implements all abstract method
 * for Bounceable interface
 */
class Tire extends Billet implements Bounceable {

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("implements method bounce() for superinterface");

	}

	@Override
	public void setBounceFactory(int bf) {
		// TODO Auto-generated method stub
		System.out.println("implements method bounce() for superinterface");

	}

	@Override
	void getBillet() {
		// TODO Auto-generated method stub
		
	}

}

abstract class Ball implements Bounceable {
	/*
	 * no method of Bounceable are implements in ball
	 */
	void beSpherical() {
	};
}

/*
 * 
 */
class BeachBall extends Ball {

	@Override
	public void bounce() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBounceFactory(int bf) {
		// TODO Auto-generated method stub

	}

}

interface I1 {
	// 0 abstract class
	default int doStuff() {
		System.out.println("interface I1");
		return 1;
	}
}

interface I2 {
	// 0 abstract class
	default int doStruff() {
		System.out.println("interface I2");
		return 2;
	}
}

class MultInt implements I2, I1 {
	// can be override default method
	/*
	 * 
	 */
	@Override
	public int doStuff() {
		return 3;
	}

	void go() {
		System.out.println(doStruff());
	}
}