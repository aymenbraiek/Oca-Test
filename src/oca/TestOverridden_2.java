package oca;

/*
 * Instance methods are preferred over interface default methods.
 */
public class TestOverridden_2 implements EggLayer, FireBreather {
	public static void main(String... args) {
		// example 2
		TestOverridden_2 myApp = new TestOverridden_2();
		System.out.println(myApp.identifyMyself());
		// example 1
		TestOverridden_2 myapp = new TestOverridden_2();
		System.out.println(myapp.identifyMyself());

	}
}

// example 1
class HorseClass {
	public String identifyMyself() {
		return "I am a horse.";
	}
}

interface Flyer {
	default public String identifyMyself() {
		return "I am able to fly.";
	}
}

interface Mythical {
	default public String identifyMyself() {
		return "I am a mythical creature.";
	}
}

//example 2
/*
 * Methods that are already overridden by other candidates are ignored. This
 * circumstance can arise when supertypes share a common ancestor.
 * 
 * 
 */
interface AnimalI {
	default public String identifyMyself() {
		return "I am an animal.";
	}
}

interface EggLayer extends AnimalI {
	default public String identifyMyself() {
		return "I am able to lay eggs.";
	}
}

interface FireBreather extends AnimalI {
}

//example 3
interface OperateCar {
	// ...
	default public int startEngine(EncryptedKey key) {
		return 0;
		// Implementation
	}
}

interface FlyCar {
	// ...
	default public int startEngine(EncryptedKey key) {
		return 0;
		// Implementation
	}

}

class EncryptedKey {
}

class FlyingCar implements OperateCar, FlyCar {
	// ...
	public int startEngine(EncryptedKey key) {
		FlyCar.super.startEngine(key);
	
		OperateCar.super.startEngine(key);
		return 0;
	}
}