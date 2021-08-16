package testOca;

public class polymorhismOverloaded {
	/*
	 * 
	 * 
	 * rules: call overridden method : 1.Object type(the type of the actual instance
	 * on the heap) determines which method is selected
	 * 
	 * overloaded :
	 * 1.reference type determines which overloaded version(based on declared arguments type )  is selected 
	 */
	public static void main(String[] args) {
		/* reference of type a object of type Animal */
		Animal a = new Animal();
		a.eat();// call eat() method of Animal class

		Horse h = new Horse();
		h.eat();// call eat() method of Horse class

		Animal ah = new Horse();
		ah.eat();/*
					 * Polymorhism work Actual object type(Horse) not the reference type(Animal) is
					 * used to determine with eat() is called
					 */
		Horse he = new Horse();
		he.eat("Apple");/* the overloaded eat(String) method is invoked */

		Animal a2 = new Animal();
		// a2.eat("Treats");/* CF=Compiler error Animal class doesn't have an eat()
		// method that takes String */

		Animal ah2 = new Horse();
		// ah2.eat("Carrot");/* compiler error Compiler still looks only at the
		// reference and seens that Animal class doesn't have eat() method with String
		// parameter*/
	}
}

class Animal {

	public void eat() {
		System.out.println("generic Animal Eating ........");
	}

}

class Horse extends Animal {
	@Override
	public void eat() {
		System.out.println("Horsing eating now ........");
	}

	public void eat(String s) {
		System.out.println("Horsin eating " + s);
	}
}

/*
 * Class Bar have 02 method doStuff() method not overrided (no-args version)
 * doStuff method is overloaded
 * 
 */
class Foo {
	void doStuff() {
	}
}

class Bar extends Foo {
	/*
	 * 
	 */
	void doStuff(String s) {
	}
}