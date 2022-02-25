package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo10 {

	public static void main(String[] args) {
		//HashMap m = new HashMap();
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101,"john");
		m.put(102, "scott");
		m.put(103, "clerk");
		m.put(104, "david");
		m.put(105, "jooo");
		m.put(null, null);
		System.out.println(m);
			//to print the particular value
		System.out.println(m.get(102));
		System.out.println(m.get(104));
		System.out.println(m.containsValue("scott"));//value prsent in hashmap or not
		System.out.println(m.size());
		m.remove(103);
		System.out.println(m);
		m.remove(101, "john");
		System.out.println(m);
			//contains key
		System.out.println(m.containsKey(105));
		System.out.println(m.containsKey(107));
			//contains value
		System.out.println(m.containsValue("david"));
		System.out.println(m.containsValue("abc"));
		System.out.println(m.isEmpty());
		//m.clear();
		System.out.println(m);
		System.out.println(m.keySet());//it print only values 
		System.out.println(m.values());//it print only values 
		System.out.println(m.entrySet());
		for(Object a : m.keySet()) {
			System.out.println(a);
		}
		for(Object b : m.values()) {
			System.out.println(b);
		}
			//to print the key and values 
		/*for(Object c : m.keySet()) {
			System.out.println(c + "........." + m.get(c));
		}*/
			//Entry Methods
		/*for(Map.Entry entry : m.entrySet()) {
			System.out.println(entry.getKey() + "   "+ entry.getValue());
		}*/
			//iterator method
	Set s =	m.entrySet();
Iterator itr =s. iterator();
while (itr.hasNext()) {
	
Map.Entry entry = (Entry) itr.next();
	System.out.println(entry.getKey() + "   "+ entry.getValue());
	 	//all three are performing same operation
}
	}

}
