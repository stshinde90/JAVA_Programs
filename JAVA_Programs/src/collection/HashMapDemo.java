package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
  
	// Map takes the values in the Key Value pair format
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String>  hm = new HashMap<Integer, String>();
		
		hm.put(0, "first");
		hm.put(1, "second");
		hm.put(2, "third");
		hm.put(3, "fourth");
		hm.put(4, "fifth");
		
		//System.out.println(hm.get(4));
		hm.remove(1);
		//System.out.println(hm.get(1));
		hm.put(1, "New value added");
		//System.out.println(hm.get(1));
		
		
		// Converting hashMap to Set
		
		Set<Entry<Integer, String>> st = hm.entrySet();
		
		Iterator<Entry<Integer, String>> it = st.iterator();
		
		while(it.hasNext()) {
		
			//System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
