package testOca;

import testOca.Test.Animalt;

/*
 * for the exam ,
 * overloaded method can change the return type 
 * but overriding method can do so do within the bounds o covariant returns (return type of new Overriding method is subclass for return type of superclass method)
 */
public class TestReturnType {
	/*
	 * difference between return type rules for overloaded and overriding methods
	 */
//1. return type on Overloaded Methods 
	/*
	 * overloaded method is the same name of superclass but we must change the parameter and we can change return type 
	 * to overloaded method we must change parameter  and 
	 * if we inherit a method but overloaded it in a subtype we can declare any return type 
	 */
}
 class Foo2{
	void go() {};
}
 
 class Bar2 extends Foo2{
	 String go(int x) {
		 return null;
	 }
 }

 class Bar3 extends Foo2{
	// String go() { return null;}; no legal can't change only the return type 

 }
 /*
  * Overriding and return Types and Covariant Returns 
  * since java 5 we can override superclass method and change type return 
  * rule : return type of overriding method :new return type is a subtype of the declared return type of the overriden (superclass)method 
  */
 /*
  * others rules apply to overriding 
  * access modifiers + declared exception
  */
 
 class Alpha {
	 Alpha doStuff(char c)
	 {
		 return new Alpha();
	 }
 }
 class Beta extends Alpha
 {    @Override
	 Beta doStuff(char c) {
		 return new Beta();
		 
	 
	 }}
 
 /*
  * Returning a Value 
  * we can return  null in a method 
  */
class Test{
	public String go()
	{
		return null;
	}

public String[] method()
{
	return new  String[] {"a","b","c"};
}
// char is compatible with int 
public int method2()
{
	char c='c';
	return c;
}
//in method with primitive return type ,we can return any value or variables that can
//be explicitly cast to the declared return type
public int method4() {
	float f=32.5f;
return (int)f;
}
// we must not return type of a method with a void return type
public void bar() {
	//return "this is a bar"; not legal
}
//

public int  methodtest() {
	
	//return null;// solution cast to integer or change return type to object or string 
	return 1;
}

// assume that Horse extends Animal
public  Animalt getAnimal() {
	 return new Horset();
	
}
 class Animalt{}

class  Horset extends Animalt{}
//return an int array  which is still n object 
public Object getObject() {
int[] numbers= {1,2,3};
return numbers;
}


// return interface implementer 
public interface Chewable{}
public class Gum implements Chewable{}
public class TestChewable{
public Chewable getChewable() {
	return new Gum();
}
}
//Bear is-A Animaltt
//CS Return type is a subtype 

public abstract class Animaltt{}
public class Bear extends Animaltt{}
public class Testt{
	Animaltt getAnimaltt() {
		return new Bear();
	}
	
}
}

