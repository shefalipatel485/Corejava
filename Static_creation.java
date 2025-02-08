package Modifiers;

public class Static_creation {

	int id;
	String name;
	static String collage="ADIT";
	public Static_creation(int id,String name) {
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	void display() {
		
		System.out.println(id+" "+name+" "+collage);
	}
		public static void main(String[] args) {
	Static_creation st=new Static_creation(1, "abc");
	Static_creation st1=new Static_creation(2, "abc");
	Static_creation st2=new Static_creation(3, "abc");

	st.display();
	st1.display();
	st2.display();
}
}
