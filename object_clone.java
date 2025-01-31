package Object_class;

class Student implements Cloneable{

	int id;
	String name;
	
	public Student(int id,String name) {
		
		this.id=id;
		this.name=name;
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
}



public class object_clone {
public static void main(String[] args) throws CloneNotSupportedException {
	
	
	Student st=new Student(1, "shefali");
	Student st1=(Student) st.clone();
	st.display();
	st1.display();
	
}
}
