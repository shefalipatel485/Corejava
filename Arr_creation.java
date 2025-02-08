package Array_programs;

public class Arr_creation {
public static void main(String[] args) {
	
	
	
	/*
	 * int a[]= {1,2,23,3,4,5};
	 * 
	 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
	 * 
	 */
	
	int a[]=new int[5];
	a[0]=12;
	a[1]=23;
	a[2]=34;
	a[3]=45;
	a[4]=21;
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
}
}
