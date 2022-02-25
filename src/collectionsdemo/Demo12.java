package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo12 {

	public static void main(String[] args) {
		List<String> lis = new LinkedList<>();
		lis.add("111");
		lis.add("222");
		lis.add("333");
		lis.add("444");
		lis.add("555");
		System.out.println(lis);
		System.out.println(lis.get(2));
		lis.remove(1);
		lis.remove("444");
		System.out.println(lis);

	}

}
