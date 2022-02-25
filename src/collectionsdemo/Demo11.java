package collectionsdemo;

import java.util.Hashtable;

public class Demo11 {

	public static void main(String[] args) {
		//Hashtable h = new Hashtable();//initial capacity is 16 and load factor is 0.75
		//Hashtable h = new (initialcapacity);---create hashcode obj with some capacity
		//Hashtable  h = new Hashtable(initialcapacity,fill ratio/loadfactor);
		Hashtable<Integer, String> h = new Hashtable<Integer,String>();
		h.put(7, "mahi");
		h.put(13, "Faf");
		h.put(8, "Jaddu");
		h.put(17, "ABD");
		//h.put(null, "abc");//null keys are not accept in Hashtable
		//h.put(9, null);// null values are not accept in Hashtable
		System.out.println(h);
		//get, remove, contains, isEmpty,keySet,values(), Entryspecific iterator(), for()  all are same as Hashmap
	}

}
