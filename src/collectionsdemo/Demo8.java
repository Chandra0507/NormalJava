package collectionsdemo;

import java.text.Format;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Demo8 {
	public static void main(String[] args) {
		HashSet lst = new HashSet();
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		System.out.println(lst); //----output is random order
		LinkedHashSet lst1 =new LinkedHashSet();
		//LinkedHashSet<Integer> lst = new LinkedHashSet<Integer>();
		lst1.add(100);
		lst1.add(200);
		lst1.add(300);
		lst1.add(400);
		System.out.println(lst1);  //---output is preserved order
		Object tempVar;
	}

}
