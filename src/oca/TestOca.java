package oca;

public class TestOca {
	// identifiers
	/*
	 * must can begin with a letter ,an underscore,or a currency character 
	 * after the first character identifiers can also digit 
	 * identifiers can be of any length
	 */
	
	
	// Class Access Modifiers 
	/*
	 * there are tree access modifiers public,protected,private 
	 * there are four access level :private ,default,protected,public 
	 * classes can have only public or default access
	 
	 * 
	 */
	//
	
	//Class Modifiers (Nonaccess)
	/*
	 * A class cannot be both final and abstract 
	 * A final class cannot be subclassed 
	 * A abstract class cannot be instantiated
	 *  A single abstract method in a class means the whole class must be declared abstract 
	 * An abstract class can have both abstract  and nonabstarct  method 
	 * the first concrete (nonabstract) class to extend an abstract class must implement all of 
	 its abstract method
	 */
	
	
	//Interface 
	/*
	 * Interfaces can be implemented by any class 
	 * by default interface is abstract 
	 * Interface have static,default and abstract methods 
	 */
	public final  class Test {

		
		// A final class cannot be subclassed
	}
	
	public abstract class Test2{
		// A abstract  class  cannot be instantiated
	}
	
	/*
	 *  only public, private, abstract, default, static and strictfp are permitted
	 *  interface method are by default public 
	 */
	public  abstract interface I3{
		 int x=0;//public static final 
		void go();
		//concrete 
		static void goStaticMethod(String c,Person p) {
			//implement method here 
		}
		//concrete 
		default void goDefaultMethod() {
			//implement method here 
		}
	}
	
	
	class Person implements I3{

		@Override
		public void go() {
			// TODO Auto-generated method stub
			
		}}

}
