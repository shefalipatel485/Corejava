package Basics;

public class Switch {
public static void main(String[] args) {
	
	int a=100,b=5;
	char c='r';
	switch (c) {
	case '+': {
		int sum=a+b;
		System.out.println(sum);
		break;
		
	}
	case '-': {
		int sum=a-b;
		System.out.println(sum);
		break;
		
	}
	case '*': {
		int sum=a*b;
		System.out.println(sum);
		break;
		
	}
	case '/': {
		double sum=a/b;
		System.out.println(sum);
		break;
		
	}
	
	default:
		System.out.println("invalid value");
	}
	
	
	
}
}
