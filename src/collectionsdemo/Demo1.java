package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		//System.out.println(al);
	//Adding all the collections into array list	
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
	al_dup.removeAll(al);
		System.out.println("after removing :" + al_dup);
		
		System.out.println("Elements in the array list : " + al);
		//Sorting ------collections.sort();
		Collections.sort(al);
		System.out.println("After sorting the array list is :" + al);
		//Reversing the order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after reversing the order is : " + al);
			//shuffling the order ------shuffle();
		Collections.shuffle(al);
		System.out.println("after shuffleing the array list is : " + al);
	}

}
