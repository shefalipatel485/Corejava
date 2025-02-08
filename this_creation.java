package Modifiers;

public class this_creation {
	
	//
	int id;
	String name;
	
	void this_creation1(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	
	void display() {
		
		System.out.println(id+" "+name);
	}
	
	
public static void main(String[] args) {
	
	this_creation t=new this_creation();
	t.this_creation1(1, "java");
	t.display();
}
}
