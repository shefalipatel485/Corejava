package OOPS;

import java.util.Scanner;

class Admin{
	Scanner scn=new Scanner(System.in);
	int size;
	int id[],marks[];
	String name[];
	public Admin() {
	
		System.out.println("enter array size");
		size=scn.nextInt();
	
		// TODO Auto-generated constructor stub
	}
}
class Student extends Admin{
	
	
	public Student() {
	
		id=new int[size];
		marks=new int[size];
		name=new String[size];
		
		System.out.println("enter id name and marks");
		
		for(int i=0;i<size;i++) {
			
			id[i]=scn.nextInt();
			name[i]=scn.next();
			marks[i]=scn.nextInt();
			
		}
		
		
		// TODO Auto-generated constructor stub
	}
	
}
class Display extends Student{
	public Display() {
	
		for(int i=0;i<size;i++) {
			System.out.println(id[i]+" "+name[i]+" "+marks[i]);
		}
		
		// TODO Auto-generated constructor stub
	}
}
public class Inheritanc_array {
public static void main(String[] args) {
new Display();	
}
}
