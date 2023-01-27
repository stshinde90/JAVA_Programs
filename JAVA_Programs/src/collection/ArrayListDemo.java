package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// List can accept duplicate values
		//ArraList,LinkedList,vector- Implementing List interface
		//array have fixed size where as arraylist can grow dynamicaly
		//you can access and insert any value in any index

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("first added");
		a.add("test");
		a.add("Abc");
		a.add("qwe");
		a.add("last added");
	    a.add("second");
		
		System.out.println(a.indexOf("Abc"));
		System.out.println(a.get(4));
		System.out.println(a.contains("qwe"));
		
	}

}
