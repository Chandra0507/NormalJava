package collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo3 {
	
		//LinkedList
		
	public static void main(String[] args) {
			//Declaring LinkedList
		//LinkedList<Integer> l1 = new LinkedList<Integer>();----it stores integer values
		//LinkedList<String> l2 = new LinkedList<String>();----it stores String values
		//List l3 =new LinkedList<>(); ---------List is a parent of LinkedList
		LinkedList l = new LinkedList(); //--------it stores heterogeneous data
		l.add(183);
		l.add("mahi");
		l.add(5.10);
		l.add('7');
		System.out.println(l);
		System.out.println(l.size());
			//Remove
		l.remove(1);//index
		System.out.println(l);
		l.remove("5.10");
		System.out.println("after removing the obj is : " + l);
			//insert element in the list 
		l.add(2, "java");
		System.out.println("after adding the element is : " + l );
			//set 
		l.set(3,6.6);
		System.out.println("after set the obj is : " + l);
			//contains
		System.out.println(l.contains("java"));
		System.out.println(l.contains("c#"));
			//is empty
		System.out.println(l.isEmpty());
		System.out.println(l.getFirst());//------it will print the 1st node object
		System.out.println(l.getLast());//-------it will print the last node object
		l.addFirst(200);
		System.out.println(l);//---------it will add the 1st in the nodes memory
		l.addLast("234");
		System.out.println(l);//---------it will add the last in the nodes memory
		l.removeFirst();
		System.out.println(l);//---------it will remove the first node
		l.removeLast();
		System.out.println(l);//---------it will remove the last node//[183, 5.1, java, 6.6]
		
			//Reading elements from LL
		/*System.out.println("reading elements from LL by using for loop");
		for(int i=0;i<=l.size();i++) {
			System.out.println(l.get(i));
		}*/
		/*System.out.println("reading elements from LL by using for each loop");
		for(Object o : l) {
			System.out.println(o);
		}*/
		System.out.println("reading elements from LL by using Iterator method");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
	

}
