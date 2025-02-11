package OOPS;

class parent2{
	
	void test() {
		
		System.out.println("default method");
	}
	void test(int i) {
		System.out.println(i);
	}
	
}

class child1 extends parent2{
	
	void test() {
		super.test();
		System.out.println("child class");
		
	}
	void test(int i) {
		super.test(10);
		System.out.println(i);
	}
	
}

public class inheritance_2 {

	
	
	public static void main(String[] args) {
		child1 c=new child1();
		c.test();
		c.test(20);
}
}
