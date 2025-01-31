package Basics;

import java.util.Scanner;

public class array_userinput {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter id and name");
	int n=5;
	int id[]=new int[n];
	String name[]=new String[n];
	for(int i=0;i<n;i++) {
		
		id[i]=scn.nextInt();
		name[i]=scn.next();
	}
	
	for(int i=0;i<n;i++) {
	System.out.println(id[i]+"  "+name[i]);
	
	}
	
}
}
