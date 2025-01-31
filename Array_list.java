package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
public static void main(String[] args) {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(124);
	al.add(234);
	
	ArrayList<Integer> al1=new ArrayList<Integer>();
	al1.add(12);
	al1.add(23);
	
	al.addAll(al1);
	Iterator<Integer> i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	
}
}
