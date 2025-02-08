package Array_programs;

import java.util.Scanner;

public class Array_userInput {
public static void main(String[] args) {
	
	//student has id and name
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scn.nextInt();
	int id[]=new int[size];
	String name[]=new String[size];
	int mobile[]=new int[size];
	//mobile no
	
	System.out.println("enter id and name");
	for(int i=0;i<size;i++) {
		id[i]=scn.nextInt();
		name[i]=scn.next();
		mobile[i]=scn.nextInt();
	}
	
	
	System.out.println("your id and name::");
	for(int i=0;i<size;i++) {
		System.out.println(id[i]+"  "+name[i]+"  "+mobile[i]);
	}
	
	
	
}
}
