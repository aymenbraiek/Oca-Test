package oca;

import java.io.IOException;

public class TestOverloaded {
	/*
	 * Overloaded method must change the argument list
	 * can change the return type
	 * can change the access modifier
	 * can declare NEW or broader(plus large) checked exceptions
	 * change number of parameters 
	 * change order of parameters 
	 */
	public static void main(String[] args) {
		Adder adder=new Adder();
		int b=27;
		int a=3;
	int result=adder.addThem(b, a);
	double doubleResult=adder.addThem(22.9, 21.8);
	}
}
/*
 * not overriding because we changed the argument list 
 * it is overloaded === with overloaded we can declare checked exceptions
 */
class Foo{
	public void doStuff(int y,String s) {}
	public void moreThing(int x) {}
	public void changeSize(int size,String name,float pattern) {
		System.out.println("Overloaded this method");
	}
}
class Bar extends Foo{
	//Overloaded 
	public void doStuff(int y,long s) throws IOException{
		System.out.println("not overriding here is overloaded");
	}
	public void changeSize(int size,String name) {};
	public void changeSize(float pattern,String name) {};
	
}
/*
 * Invoking Overloaded Methods 
 * invoking overloaded Method that take object reference rather than primitives is a little more interesting
 * can main() be overloaded 
 * 
 */

class Adder {
	public int addThem(int x,int y)
	
	{System.out.println("method 1");
		return x+y;}

public double addThem(double x,double y)
{System.out.println("method 2");
	return x+y;}
}
