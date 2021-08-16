package testOca;
//CANNOT make a new Object without invoking constructor 

//not return type
// name must exactly match the class name 
//used to initialize the instance variable state 
//we can 
//every constructor invokes the constructors of its superclass with an implicit
//only static method or variable can be passed in this() or super()
public class TestContructorsAndInstantiation {
	public static void main(String[] args) {
		Foott foott = new Foott();
		System.out.println("before initlization" + foott.size + "name:" + foott.name);
		foott.name = "aymen";
		foott.size = 12;
		int x=(int)(Math.random()*5);
		System.out.println("result"+x);
	}

}

//abstract class have a constructor 
abstract class Btest {
	void go() {
		System.out.println("hello world");
	}

	public Btest() {
		super();
		// TODO Auto-generated constructor stub
	};

}

class Foott {
	int size;
	String name;

	public Foott() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Foott(int size, String name) {
		super();// for super class Object
		// used to initialize the instance variables
		this.size = size;
		this.name = name;
	}
	// constructor chaining
	// the constructors are invoked in the runtime when we say new

	// the Horse constructor is invoked
	// every constructor invokes the constructors of its superclass with an implicit
	// call super()
	// constructor invokes an overloaded constructor of the same class
	// constructor can use any access modifier including private

	class Animalttt {
		

		public Animalttt(String lastName) {

			super();
			// TODO Auto-generated constructor stub

		}

		public Animalttt() {
			// TODO Auto-generated constructor stub
		}

	}

	class Horseh extends Animalttt {
		private int size;
		private String name;
		String lastName;

		public Horseh() {
			super();
			// TODO Auto-generated constructor stub
		}

		protected Horseh(int size, String name) {
			super();
			this.size = size;
			this.name = name;
		}

//overloaded constructor 
		public Horseh(String name, int size) {
			this();
			this.name = name;
			this.size = size;
		}
	}
	// we can define a method with the same name as the  class but doesn't make it a constructor 
	//if we see a return type it's a method 
	// we could have both a method and a constructor with the same name
	// a default constructor will be automatically generated by the compiler (if we
	// don't type a constructor into we class)
	// the default constructor is always a no-arg constructor
	// the default constructor is the one the compiler provides
	//cannot call to an instance method or access an instance variable until after the super constructor runs
	//abstract class have constructors ,those constructors called when a concrete class is instantiated
	//the compiler won't create a constructor since one already in the Horse class 
	
class Horsetest{
int x;
		Horsetest() {
			super();
			// TODO Auto-generated constructor stub
		}
		 Horsetest(int x)
		 {
			 super();
			 this.x=x;
			 
		 }
		 }
		 void doStuff() {
			
		//	 Horsetest(); illegal we cannot call constructor
		 }
		
	
		 //the default constructor has the same access modifier as the class 
		 //the default constructor has no-arguments
		 //Constructor can have a arguments just as method 
		 
		 
		 }

/*  what happened when a superclass have a constructor with arguments*/
class AnimalTest{
	//Constructor with parameters 
	AnimalTest(String name){}

	
	
}


class HorseTest extends AnimalTest{
//every constructor invokes the constructors of its superclass with an implicit
	HorseTest() {
		
		super("aymen");
		//super(); Not illegal Problem !!!!!
		// TODO Auto-generated constructor stub
	}
	
	
}


class Clothing{
	//Constructor with arg-arguments
	Clothing(String s){}

	/* Clothing() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
}

class TShirt extends Clothing{

	TShirt(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}	
	/*TShirt(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}*/
	}
	//constructors are never inherited 
	//can't overridden 
	//can overloaded 


//first line in a  constructor must be a call to super() or a call to this(); see the TestConstructor.Animal class
// a constructor can never have both a call super and a call to this 

