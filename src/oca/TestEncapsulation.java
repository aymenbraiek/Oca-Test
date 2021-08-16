package oca;
/*
 * variables of class are private 
 * the accessor methods are public 
 */
public class TestEncapsulation {
	private String size;
	private String weight;

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}

class TestEncapsulation2 {
	TestEncapsulation encapsulation = new TestEncapsulation();

	public void methodusedCapsulation() {
		encapsulation.setSize("200");
		String size = encapsulation.getSize();
		System.out.println("size is" + size);

	}

	public static void main(String[] args) {
		TestEncapsulation2 encapsulation2 = new TestEncapsulation2();
		encapsulation2.methodusedCapsulation();
	}
}
