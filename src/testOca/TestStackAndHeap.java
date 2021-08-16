package testOca;
//instance variable and object live in the heap
//local variable live in the stack
public class TestStackAndHeap {

	//literal values for all primitives types 
	// 'b' char literal
	// 42 int literal 
	// false boolean literal 
	// 2546798.23 double literal
	
	//numeric literals with underscores 
	// we can use the underscore character for any of the numeric type
	//cannot add an underscore character directly next to the decimal point  or next to the X or B in hex or binary numbers
	// cannot use underscore at the beginning or end of the literal 
/*
 * Decimal literals  base 10 allowed digits are 0-9 int x=232;
 * Binary literal base 2 can use the digits 0 and 1 binary must start with 0B or 0b int x=0b10101;
 * octal literal base 8 allowed 0-7  to represent an integer in octal form by placing a zero in front of the number int x=06;
 * Hexadecimal  literal base 16 [0-9] -[A-Z] int x=0X0001;
 * For Hexadecimal, the 0x or 0X is to be placed in the beginning of a number.
 * Digits 10 to 15 are represented by a to f (A to F) in Hexadecimal
 * 	0xcafe and 0XCAFE are both legal and have the same value
 * binary , octal,decimal, and hexadecimal )are defined as int by default but they may also be specified as long by placing a suffix of l or l
 * long jo=0x1234fL;
 * long jo=1101254l;
 */
	
	/*
	 * Floating-point Literals
	 * are defined as a number,a decimal symbol and more number representing the fraction
	 * double b =11381454.988124;
	 * are defining as double by default ,so if you want to assign a floating-point literal we must attach the suffix F or f
	 * int x=25.342 not compile because of the comma 
	 * 
	 */
/*
 * Boolean literals 
 * A boolean value can be defined only as true or false 
 * 
 * boolean x=true; legal
 * boolean x=0;  illegal 
 */
	/*
public int x=1;
if(x)
{//won't compiler error 
	}

*/
	/*
	 * 
	 * Character Literal 
	 * A char is representing by a single character in single quotes 
	 * char a ='c';
	 * char b='@';
	 * you can also type in the unicode value of the character 
	 * char x='\u004F';
	 * unsigned 16 bit range [0 to 65535)
	 * char x=0x892;
	 * char x=1245;
	 * char c=700000 ; outside the range
	 * char c=-29 ; outside the range 
	 * 
	 */
	 
	
	/*
	 *literal value for string 
	 *A String literal is a source code representation of a value of a String object 
	 *String s="Bill john";
	  System.out.println("john"+"Bill");
	 */
	
	/*
	 * Assignment Operators
	 * x=6 ; 
	 * Button b;
	 * The button variable b is not referring to any object
	 * b reference variable 
	 */
	
	
	
	/*
	 * Primitives Assignments 
	 * we can assign a primitive variables using a literal or the result of an expression
	 * int x=7; 7 is int (int is a literal )=> literal assignment
	 * int y =x+7 => assignment with an expression 
	 * int z=x+y => assignment with an expression 
	 * 
	 */

public static void main(String[] args) {
	byte b=27;
	System.out.println(b);
	byte a=3;
	byte c=4;
	//byte z=a+c ;
	byte z=(byte) (a+c);
	System.out.println(z);
	float x=100.001f;
	double y=23.100;
	int s=(int) 12.3;
	long var=13255666;
	int valeur=(int) 1235.200;
	System.out.println("valeur cast float to int"+valeur);
	// print 1235
	/*
	 * we can cast  larger number type such long to byte
	 * 
	 */
	long l=56L; 
	byte v=(byte)l;
	System.out.println("cast long to byte"+v);
	/*
	 * if the long value is larger to 127 
	 * when we long value is larger to 127 and cast to byte not get runtime error 
	 * the primitive will have a negative value 
	 */
	long t=130L;
	byte xbyte=(byte)t;
	System.out.println("cast long value is larger to 127 to byte"+xbyte);
	/*
	 * Assigning the float-point numbers 
	 */
	float b1=234.56F;
	System.out.println("cast float to short "+(short)b1);
	float f=(float) 32.3;
	float fi=32.3f;
	float f2=32.3F;
	/*
	 *  +=,-=,*= will all put in an implicit cast 
	 *  if value is in the range
	 */
	int valeur2=12;
	valeur2+=123.56;
	
	
	byte k=3;
	k+=5;
	
	/*
	 * Assigning  a Literal  that is too large for the variable 
	 * not compiler error
	 */
	byte bi=(byte) 128;
	/*
	 * Assigning One Primitive Variable to Another Primitive Variable 
	 * a and b not referring to same place in memory
	 */
	int ab =6;
	System.out.println("fisrt value of ab"+" "+ab);
	int bb=ab;
	bb=30;
	System.out.println("bb"+bb);
	System.out.println("value of ab is not change"+" "+ab);
	/*
	 * Reference Variable Assignments 
	 */
	Button button=new Button();
	//Make a reference variable button of type Button
	//create a new Button  object  on the heap 
	//Assigns the newly created Button object to reference variable button
	Button buttonTwo=null;
	//a reference variable buttonTwo is not referring to any object 
	
	Integer x3=new Integer(55);
	
	Long wq=new Long(42);
	Short ws=new Short("75");
	System.out.println("value of wq"+" "+wq);
	System.out.println("value if ws"+" "+ws);
}
/*
 * int i,j,k;
 * int i=0,k,j=12;
 * int i=0,k=m+1,m=2;//illegal ma not initialized before  to used
 * int i,k=2;m=k+1 legal k is initialized before to used 
 */

/*
 * Primitives casting 
 * implicit cast =don't have to write code for the cast
 * int x=100;
 * long b=a; an int value always fits in a long 
 * 
 * byte -> short -> int -> long -> float -> double 
 * explicit cast =
 * widening => implicit cast 
 * Narrowing <= required an explicit cast 
 *  when casting a floating  to integer 
 */
/*
 * Reference Variable Assignment 
 * 
 */
class Foo{
public void doFooStuff() {
	
}
}
class Bar extends Foo{
	
	@Override
	public void doFooStuff() {
		
	}
}
class TestMain{
	public void main(String[] args) {
		Foo foo=new Bar();//Legal Bar is a subclass  for Bar 
		//Bar bar=new Foo(); //illegal Foo is  a superclass for Bar solution= with cast 
		
	}
}
}
class Button{}