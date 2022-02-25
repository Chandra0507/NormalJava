package collectionsdemo;

import java.util.HashSet;

public class Demo6 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(5);
		hs.add(8);
		hs.add(7);
		System.out.println(hs);
		HashSet<Integer> h = new HashSet<Integer>();
		h.addAll(hs);
		h.add(100);
		System.out.println(h);
			//remove
		h.removeAll(hs);//---remove the common elements present in the both the hs and h remaining will print
		System.out.println(h);
	}

}
