package Basics;

public class array_method {

	void pass_array(int arr[]) {
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println(min);
		
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
	}
	
	
	public static void main(String[] args) {
	
		int arr[]= {23,434,11,23};
		array_method arr1=new array_method();
		arr1.pass_array(arr);
		
}
}
