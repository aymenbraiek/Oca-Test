package oca;

public abstract class TestAbstract {
	// A class with default access can be seen only classes within the same package
	// 0 or 1 abstract method
	// class have abstract method must be abstrat
	// we can't instantiated abstract class
	// when i have many variables or method commune in all class i regroup
	// we can herit abstract class
	// concrete subclass must be implement all abstract methods
	// abstract class can be have concrete(nonabstract) method
	// The class TestAbstract can be either abstract or final, not both
	abstract void getById();

//all method abstract of superclass must be override in subclass
	private String name;

	void getByName(String name) {
		System.out.println("super class ");
	}

}

// only public, abstract & final are permitted to assigned 
 class TestSubclassAbstart extends TestAbstract {

	@Override
	void getById() {
		// TODO Auto-generated method stub
		System.out.println("override all method abstact of superclass");

	}

	@Override
	void getByName(String name) {
		System.out.println("override nonabstract method of superclass");
	}
}

class TestSubclassAbstart2 extends TestSubclassAbstart {
/*
 * 
 */
}
