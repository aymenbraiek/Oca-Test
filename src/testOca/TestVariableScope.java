package testOca;

/*
 * Static variable have the longest scopes (they are created when the class loaded and survive as long as the class stays loaded in JVM)
 * instance variable are the next most long-lived ,they are created when a new instance is created and they live  until the instance is removed
 * local variable are next ,they live as long as their method remains on the stack  
 * bloc variable live only as the code block is executing 
 * null is not means the same as an empty String("") 
 * A null value means the reference variable is not referring to any object on the heap
 * 
 */
/*
 * attempting to access an instance variable from a static context 
 *  default value of Object reference null
 *  int,byte,short,long =0
 *  double or float 0.0 
 *  boolean false 
 *  char '\u0000'
 * 
 */
public class TestVariableScope {
	int year; 
	static int a = 343;// Static variable
	//attempting to access an instance variable from a static context
	int x;// Instance variable
	

	{
		x = 7;
		int x2 = 5;
	}// Initialization Blocks

	// Constructor
	TestVariableScope() {
		super();
		x += 8;
		int x3 = 6;
	}

	// Instance method
	void doStuff() {
		int y = 0;
		for (int z = 0; z < 4; z++) {
			y += z + x;
		}
	}
public static void main(String[] args) {
	//x++; won't compile x is an instance variable 
	ScopeErrors s=new ScopeErrors();
	s.go();
	BirthDate dh=new BirthDate();
	dh.showYear();
	System.out.println("String object"+dh.getTitle());
	Book book=new Book();
String sys=book.getTitle2();
System.out.println("value of sys"+sys);
//String  lowerString=sys.toLowerCase();//java.lang.NullPointerException
//need to test if not null
if(sys != null)
{
	String  lowerString=sys.toLowerCase();
	System.out.println("not hava a exception"+lowerString);
}
}

}
class BirthDate{
	int year;
	private String title;
public String getTitle() {
	return title;
}
	public void showYear() {
		// TODO Auto-generated method stub
		System.out.println("default value of instance value "+year);
	}}
class Book{
	
	private String title2;
	public String getTitle2() {
		return title2;
		
	}
}
class ScopeErrors{

	public void go() {
		// TODO Auto-generated method stub
		int y=2;
		go2();
		y++;
		
	}

	 void go2() {
		// used local variable for other method not illegal
		//y++; won't compile y is a local to go();
		 for(int z=0;z<5;z++){
			 boolean test=false;
			 if(z==3)
			 {
				 test=true;
				 break;
			 }
			
		 }
		// System.out.println(test); test is an ex-variable it has ceased to be ...cannot find symbol
	}}