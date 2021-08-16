package testOca;

//static initialization blocks run when the class is first loaded 
//instance initialization blocks run when an instance is created 
public class TestInitializationBlocks {
	static int x;
	int y;

	void go() {
		System.out.println("method");
	}

	static {
		x = 7;
		System.out.println("static initialization blocks not need to instance is created");
	}
	{
		y = 8;
		System.out.println("instance initialization blocks");
	}

	public static void main(String[] args) {
		TestInitializationBlocks blocks = new TestInitializationBlocks();
		blocks.go();
		// An instance initialization blocks runs once every time a new instance is
		// created
		TestInitializationBlocks blocks2 = new TestInitializationBlocks();
		System.out.println("---------------------------------");
		new Init();
		System.out.println("--------------------------------");
		new Init(3);
	}

}

class Init {
	Init(int x) {
		super();
		System.out.println("1-args constr");
	}

	Init() {
		super();
		System.out.println("0-args constr");
	}

	static {
		System.out.println("1st static initialization blocks ");
	}
	{
		System.out.println("1st instance initialization blocks");
	}
	{
		System.out.println("2st instance initialization blocks ");
	}
	static {
		System.out.println("2st static initialieation blocks");
	}

}
