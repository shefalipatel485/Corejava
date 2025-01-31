package array;

public class array_copy {
public static void main(String[] args) {
	
	
	char c[]= {'a','b','c','d','e','f','g','h'};
	char c1[]=new char[5];
	
	System.arraycopy(c, 1, c1, 0, 5);
	
	System.out.println(String.valueOf(c1));
	
	
	
	
}
}
