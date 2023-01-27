package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	//There is no guarantee elements are stored in sequential orders
	//Does not accept duplicate values
	//HashSet, LinkedHashSet and TreeSet implements Set interface
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		
		//System.out.println(hs);
		
		// Iterator is an Interface 
		//=> iterates each and every object present in the Set
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) { // hasNext will check whether next index is present or not
			
			System.out.println(it.next());
			
		}
		

	}

}
