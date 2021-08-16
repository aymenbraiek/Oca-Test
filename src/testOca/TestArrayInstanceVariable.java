package testOca;

import java.util.Date;

/*
 * An array is object 
 * Array elements area always given default values regardless of where the array itself is instantiated
 */
/*
 * local (Stack,Automatic) Primitives and objects
 * local variable are defined within a method 
 * local variable including primitives must be initialized before you attempts to use them
 * local variable not have a default value
 */

/*
 * local Object References
 * when declared within a method rather than as instance variables
 * instance variable reference are always given a default value is null
 * local reference are not given a default value
 */

/*
 * local array 
 * array declared within a method must be assigned a value before use
 */
/*
 * Assigning One Reference Variable to Another
 * if assign reference variable a1 to reference variable b1 the bit pattern in a1 copied and is placed into b1
 *  String object are immutable we can't change the value of a string object 
 * 
 */
public class TestArrayInstanceVariable {
	static Date date;
	static int [] year=new int[100];
	static String[] strArray = new String[10];
	public static void main(String[] args) {
		int x;
		int annee;
		//System.out.println("annee"+annee); variable annee may not have been initialized
		for (int j = 0; j < strArray.length; j++) {
			System.out.println("value"+strArray[j]);
			
		}
		for (int i = 0; i < year.length; i++) {
			//System.out.println("year["+i+"]"+" "+year[i]);
			
		}
	/*	if(args[0] != null) {
			x=7;
		}*/
		//int y=x; the compiler knows that the initialization might be not happen and can produce an error
		//x may be not have been initialized
		System.out.println("instance reference varibale"+date);
		Date date2;// explicitly set the local reference variable to null  Date date2=null;
		//System.out.println("reference variable within a method"+date2); //The local variable date2 may not have been initialized
		//we do no however need to explicitly initialize the element of an array
		int[] arraysint=new int[20];
		System.out.println("array within method"+arraysint[0]);
 	
	String s="FRED";
	String t=s;
	System.out.println("first String"+s);
	System.out.println("first t"+t);
	String g=t.toLowerCase();
	System.out.println("g is changed"+g);
	System.out.println("not changed"+s);
	
	}

}
