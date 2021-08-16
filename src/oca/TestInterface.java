package oca;

public interface TestInterface extends I1, I2 {
	// by default public abstract interface TestInterface extends I1, I2
	// interface can be only with public modifiers
	// by default interface is abstract
	// interface can be implement many others interfaces

	void go();// public abstract method

	int x = 0;// by default constant with public static final keyword

	/*
	 * what is the  of used static and default methods in interface 
	 */
	static void method() {
		System.out.println("implements method static in interface");
	};
	default void methodDefault() {
		System.out.println("this methos is default");
	}

}

interface I1 {
}

interface I2 {
}

// ever class that implement an interface must implement all method s from
class TestInterfaceClass implements I1, I2, TestInterface {
/*
 * must implements all abstract method 
 */
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("must implement all method of interface ");
		methodDefault();
	
	}

}
