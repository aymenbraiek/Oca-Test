package oca;
/*
 * Overridden methods
 */
public class TestOverriding {
	/*
	 * we cannot overridden  method at marked final 
	 * we cannot overridden method at marked static 
	 * for abstract method we must implement all method of superclass unless the sub
	 * rule====> not final ,method of superclass, my class not abstract(we not must implement method abstract of superclass
	 * abstract methods must be implemented by the first  concrete (nonabstract) subclass
	 * abstract methods as methods you 're forced to Overriden 
	 * all Animal subtypes should have a eat method defined in a unique way
	 * Horse IS-A Animal then Animal can refer to Horse instance
	 * 
	 */
	/*
	 * the rules for overriding a method are as follows
	 * the argument list must exactly match that of the overridden method
	 * the return type must be the same as
	 * the access level can't be more restrictive than that of the overridden method= we must not decrease the access level 
	 * instance methods can be overridden only if they are inherited by the subtype
	 * the overridden method can throw  any unchecked exception
	 * the overridden method cannot throw any checked exception 
	 * 
	 * if a method can't be inherited you cannot overridden it (super class with private method ,you cannot overridden because this method is not visible of the subclass
	 */
	
	public static void main(String[] args) {
		AnimalTestOverriden animalTestOverriden=new AnimalTestOverriden();
		AnimalTestOverriden animalTestOverriden2=new horseTestOverriden();
		//animalTestOverriden2.buck(); we can't invoke buck() method because Animal class doesn't have that method 
		animalTestOverriden.eat();// invoke eat method of AnimalTestOverriden class
		animalTestOverriden2.eat();//invoke eat method of horseTestOverriden class
		/*
		 * Generic Animal Eating Generiaclly
           horse eating hay.....................
		 */
		
	}
	

}
abstract class  AnimalAbstarctClass{
	abstract void methodabstract();
	void goTestOverriden() {System.out.println("instance method");};
	abstract void methodAbstractAndSubclassIsAbstract();
}


 class AnimalTestOverriden  extends AnimalAbstarctClass{
	protected void eat() {
		System.out.println("Generic Animal Eating Generiaclly");
	}
	
	public static void testStaticMethod() {
		System.out.println("cannot overidden static method");
	}

	@Override
	void methodabstract() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void methodAbstractAndSubclassIsAbstract() {
		// TODO Auto-generated method stub
		
	}
}

class horseTestOverriden extends AnimalTestOverriden{
	@Override
	 public  /* or protected */ void eat() {
		System.out.println("horse eating hay.....................");
	}
	
	/*@Override
public static void  testStaticMethod()
{}*/
	
	@Override
	void methodAbstractAndSubclassIsAbstract() {
		// TODO Auto-generated method stub
		
	}
	public void buck() {}
}

class TestAnimalType extends horseTestOverriden{
	@Override
	public void eat() {
		System.out.println("this method is overriden by ");
	}
}

	/*
	 * Invoking a SuperClass Version of a Overridden Method  super.nameoOfMethod
	 */
class Animal3{
	public void eat() {}
	public void printYourSelf() {/*some code here */}
}

class Horse3 extends Animal3{

@Override
public void printYourSelf() {
	System.out.println("invoke supertype method");
	super.printYourSelf();
}
}


interface I3{
	default void doStuff() {};
	public void doStuff2();
}

interface I4 extends I3{
	default void doStuff() {};
}

interface I5 extends I3,I4{

}
class InvokeSuperIterface implements I3,I4,I5{
	

	@Override
	public void doStuff2() {
		System.out.println("method of I3");
		// TODO Auto-generated method stub
		
	}
	
	
}