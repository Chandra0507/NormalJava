package collectionsdemo;

import java.util.HashSet;

public class Demo7 {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(8);
		set1.add(3);
		set1.add(47);
		set1.add(54);
		set1.add(7);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(3);
		set2.add(13);
		set2.add(99);
		set2.add(7);
		System.out.println(set1);
		System.out.println(set2);
			//Union
		//set1.addAll(set2);  //---set2 is add into the set1 but duplicates are removed
		//System.out.println(set1);
			//intersection
		//set1.retainAll(set2); //---what are all the common elements will be printed 
		//System.out.println("intersection" + set1);
			//Differance
		//set1.removeAll(set2);
		//System.out.println(set1);
			//subset
		System.out.println(set1.containsAll(set2));
	}

}
