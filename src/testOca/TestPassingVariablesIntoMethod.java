package testOca;
/*
 * Passing Variables into Method 
 */
/*
 * Passing Object Reference Variables
 * pass an object variable into a method ---> passing the object reference 
 * we aren't event passing the actual reference variable but rather a  copy of the reference variable 
 */
/*
 * a primitive variable is passed to a method it is passed by value which means pass-by-copy of the bits -in the variable
 * page 272
 */
public class TestPassingVariablesIntoMethod {
	public static void main(String[] args) {
		Dimension dimension=new Dimension(5,10);
		TestPassingVariablesIntoMethod intoMethod=new TestPassingVariablesIntoMethod();
		System.out.println("Before dimension.height"+dimension.height+"    "+dimension.wight);
		intoMethod.modify(dimension);
		System.out.println("after change"+dimension.height);
	dimension.bar();
	}

	private void modify(Dimension dim) {
		// TODO Auto-generated method stub
		dim.height=dim.height+1;
		System.out.println("dim is "+dim.height);
	}

}
class Dimension{
	public int wight;
	public int height;
	protected Dimension(int wight, int height) {
		super();
		this.wight = wight;
		this.height = height;
	}
	
	
	void bar() {
		FooTest2 fooTest2=new FooTest2();
		System.out.println("fooTest2"+fooTest2.name);
		doStuff(fooTest2);
	}


	private void doStuff(FooTest2 fooTest22222) {
		fooTest22222.setName("BOOOOOOOOO");
		fooTest22222=new FooTest2();
		System.out.println("fooTest22222"+fooTest22222.name);
		
	}
	
}
class FooTest2{
	
	public String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
	
}
