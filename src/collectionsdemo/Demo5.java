package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Demo5 {

	public static void main(String[] args) {
			//HashSet Declaration
		HashSet hs = new HashSet();
		//HashSet h1 = new HashSet(100);
		//HashSet h2 = new HashSet(100,(float)0.95);
		//HashSet<Integer> h3 = new HashSet<Integer>();
		//HashSet<String> h4 = new HashSet<String>();
		hs.add(100);
		hs.add("java");
		hs.add(9.8);
		hs.add('c');
		hs.add(7);
		System.out.println(hs);
			//size
		System.out.println(hs.size());
			//contains
		System.out.println(hs.contains("java"));
		System.out.println(hs.contains("xyz"));
		//isEmpty
		System.out.println(hs.isEmpty());
		//Reading objects in hashSet by using for each loop
		/*System.out.println("using for each loop");
		for(Object o : hs){
			System.out.println(o);
		}*/
			//Reading objects by using iterator
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
