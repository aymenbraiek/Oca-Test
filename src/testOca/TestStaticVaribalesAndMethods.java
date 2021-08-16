package testOca;

//a static method cannot access to instance variable (nonstatic) or methods 
//we can used object reference variable to access a static member
//static method can't be overridden 
public class TestStaticVaribalesAndMethods {
	static int frogCount = 0;
	int frogSize = 0;

	public int getFrogSize() {
		return frogSize;
	}

	static String getTest() {
		System.out.println("static method invoked ");
		return null;
	}

	protected TestStaticVaribalesAndMethods() {
		super();
		// TODO Auto-generated constructor stub
	}

	TestStaticVaribalesAndMethods(int frogSize) {
		super();
		this.frogSize = frogSize;
	}

	public static void main(String[] args) {
		new TestStaticVaribalesAndMethods();
		System.out.println("Frog count is now " + frogCount);
		TestStaticVaribalesAndMethods andMethods = new TestStaticVaribalesAndMethods(25);
		System.out.println("--------------------------------------------");
		System.out.println("invoke method " + andMethods.getFrogSize());
		getTest();
	}

}

interface FrogBoilable {
	// static method
	static int getCtoF(int eTemp) {
		return (eTemp * 9 / 5) + 32;
	}

	// default method
	default String hop() {
		return "hopping";
	}
	
	void TestAstractMethod() ;
}

class DontBoilFrogs implements FrogBoilable{
public static void main(String[] args) {
	new DontBoilFrogs().go();
}

 void go() {
	// TODO Auto-generated method stub
	System.out.println(hop());//legal invoke for default method 
	//System.out.println(getCtoF(5));//illegal invoke for static method
	System.out.println(FrogBoilable.getCtoF(5));//legal invoke for static method 
	DontBoilFrogs boilFrogs=new DontBoilFrogs();
	System.out.println("reference variable to invoke method from interface "+boilFrogs.hop());
	//System.out.println("reference variable  to invoke static method from interface"+boilFrogs.getCtoF(5)); illegal invoked method
}

@Override
public void TestAstractMethod() {
	// TODO Auto-generated method stub
	
}
}
//can 't overridden static method we can redefining 
class Animallll {
	static void doStuff() {
	System.out.println("a");
	}
	public static void main(String[] args) {
		Animallll animallll =new Animallll();
	}
	}
class Doggg extends Animallll{
	//redefining static method 
	static void doStuff() {
		System.out.println("b");
}
	//invoke with reference variable  or name of class 

}