package OOPS;
class parent1{
		public parent1() {
	
		
		System.out.println("default constructor.");
		// TODO Auto-generated constructor stub
	}
	
	
}

class child extends parent1{
	
	public child() {
	
		System.out.println("child class cons..");
		// TODO Auto-generated constructor stub
	}
	
}

public class inheritance_1 {
public static void main(String[] args) {
	new child();
}
}
