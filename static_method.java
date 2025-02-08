package Modifiers;

public class static_method {

	void display() {
		System.out.println("non static method");
	}
	static void s_method() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
	new static_method().display();;
	s_method();
	
		
}
}
