package testOca;

/**
 * @author Administrateur
 *
 */
public class TestCasting {
	/*
	 * Animal animal =new Dog(); want to use that animal reference variable to
	 * invoke method that only class Dog has
	 */
	// we ever try the cast we do an instanceof test to make sure
	public static void main(String[] args) {
		Animal2[] a = { new Animal2(), new Dog(), new Animal2() };
		for (Animal2 animal : a) {
			animal.makeNoise();
			if (animal instanceof Dog) {// if we done this test with instanceof the code compile but when we try to run
										// we will be get an exception java.lang.ClassCastExeption
				// animal.playDead();//The method playDead() is undefined for the type Animal2

				((Dog) animal).playDead();// here we used casting (downcast) when cast subclass with reference type of
											// superclass ((Dog) animal).playDead(); == Dog d=(Dog)animal; d.playDead();
			}
		}
		
		//
		Animal2 animal2 = new Animal2();
		Dog dog = new Dog();
		if (animal2 instanceof Dog) {
			Dog d = (Dog) animal2;
			// String s=(String)animal;//animal cannot be resolved to a variable
		}

	}
}

class Animal2 {

	void makeNoise() {
		System.out.println("generic noise");
	}
}

class Dog extends Animal2 {
	void makeNoise() {
		System.out.println("bark");
	}

	void playDead() {
		System.out.println("roll over");
	}
}