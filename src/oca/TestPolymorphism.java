package oca;

import java.io.IOException;
import java.nio.CharBuffer;

/*
 * CF =compile failed 
 * CS=compile success
 */

public class TestPolymorphism {
	/*
	 * class A extend B 
	 * IS-A test can be considered polymorphic
	 * 
	 */


	/*
	 * a reference variable can be of only one type and once declared,that type can never be changed
	 * a reference is a variable ,it can be reassigned to other Objects (unless the reference is declared final)
	 * a reference varibales's type determines the methods that can be invoked 
	 * a reference variable can refer to any object of the same type
	 * a reference can be refer to any subtype pf the declared type
	 * Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.
	 */
	
public static void main(String[] agrs)
{
	B b =new B();//CS
	A a =new A();//CS
	b=a;

	//a=b;CF  a reference can be refer to subclass not superclass 
}}

class B{}
class A extends B{}

/*
 * By casting object1 to a Relatable type, it can invoke the isLargerThan method.
 */
 interface Relatable {
    
    // this (object calling isLargerThan)
    // and other must be instances of 
    // the same class returns 1, 0, -1 
    // if this is greater than, 
    // equal to, or less than other
    public int isLargerThan(Relatable other);
}
 
 class findLargest implements Readable{
	 public Object findLargest(Object object1, Object object2) {
		   Relatable obj1 = (Relatable)object1;
		   Relatable obj2 = (Relatable)object2;
		   if ((obj1).isLargerThan(obj2) > 0)
		      return object1;
		   else 
		      return object2;

 }

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
 }
 
 /*
  * 
  */
interface Animatable{
	public void animate();
	public int getNombreofPlayPieces(Animatable animatable);
}
 class Shape implements Animatable{
public void displayShape() {
	System.out.println("displaying shape");
}
	@Override
	public void animate() {
		// TODO Auto-generated method stub
		System.out.println("animating.......class shape");
	}
	@Override
	public int getNombreofPlayPieces(Animatable animatable) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
 }
 class PlayerPiecee extends Shape{
	 @Override
	 public void animate() {
		 System.out.println("animating......");
		 
	 }
	 public void movePiece() {
		 System.out.println("moving game piece");
	 }
	 
	 
 }
 class TitlePiece extends Shape implements Animatable{
	 @Override
	 public void animate() {
		 System.out.println("animating......");
		 
	 }
	 public void getAdjacent() {
		 System.out.println("getting adjacent tiles");
	 }
 }
 
 class TestMain{
	 public static void main(String[] args)
	 {
		 PlayerPiecee piecee=new PlayerPiecee();//one object instance of type PlayerPiecee
		 piecee.animate();
		 Object object=piecee;
		 Shape shape=piecee;
		 Animatable animatable=piecee;
		
		 
		 /*
		  * one object instance of type PlayerPiecee
		  * four different  reference type all referring to that one object 
		  * all reference can access to displayShape() method
		  */
		 
	 }
 }
	 
	 
	 
	 
	 
	 
	 
	 
 