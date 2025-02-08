package Modifiers;

public class this_call {

	public this_call() {
	
		System.out.println("default const.");
		
		// TODO Auto-generated constructor stub
		}
	
	
	
	this_call(int id){
		
		this();
		System.out.println(id);
	}
	this_call(int id,String name){
		this(10);
		System.out.println(id+ " "+name);
	}
	this_call(int id,double d){
		this(10,"abc");
		System.out.println(id+ " "+d);
	}
		
	public static void main(String[] args) {
	this_call t3=new this_call(20,23.23);
		
}
}
