package collectionsdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Demo4 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println(l);
		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println("after adding all the linked list : " + l1);
		l1.removeAll(l);
		System.out.println(l1);
			//sort
		Collections.sort(l);
		System.out.println(l);
			//reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("after reversing is : " + l);
			//shuffle
		Collections.shuffle(l);
		System.out.println(l);
	}
	
}
