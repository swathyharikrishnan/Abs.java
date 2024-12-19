package inheritance;

interface Par1 {
	// abstract,default,static
	void disParent1();
}

interface Par2 {
	void disParent2();
}

class Child implements Par1, Par2 {

	public void disParent1() {
		System.out.println(" Father");
	}

	public void disParent2() {
		System.out.println(" Mother");
	}
}

public class Abs {

	public static void main(String[] args) {
		Child c = new Child();
		c.disParent1();
		c.disParent2();

	}

}
