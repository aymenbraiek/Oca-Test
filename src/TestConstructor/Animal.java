package TestConstructor;

public class Animal {
	String name;

	Animal(String name) {
		super();
		this.name = name;
	}

//first line in a  constructor must be a call to super() or a call to this();
	Animal() {
		// always means a call to another constructor int the same class.
		this(makerandomName());

	}

	static String makerandomName() {
		// TODO Auto-generated method stub
		int x = (int) (Math.random() * 5);
		String name = new String[] { "flurry", "fido", "rover", "spike", "gigi" }[x];
		return name;
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println("first result" + " " + a.name);
		Animal b = new Animal("zeus");
		System.out.println("second resulat" + " " + b.name);
		filsAnimal animal = new filsAnimal();
		System.out.println("xxxxx" + animal.name);
		Animal animal2 = new filsAnimal("rox");
		System.out.println("wwwww" + animal2.name);

	}
}

class filsAnimal extends Animal {

	filsAnimal() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("call a super no-arg constructor");
	}

	filsAnimal(String name) {
		// super(name);
		// TODO Auto-generated constructor stub
		System.out.println("call the constructor with parametes");
	}

}
