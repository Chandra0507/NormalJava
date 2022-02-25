package java8fea;

import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		  // Ex 1
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(1));
		System.out.println(p.test(20));
			//Ex 2
		Predicate<String> pr =s->(s.length()>4);
		System.out.println(pr.test("mahi4"));
		
			//Ex 3
		String [] names= {"mahi","Dhoni","sakshi","zeeva"};
		/*for(String name:names) {
			if(name.length()>4) {
			System.out.println(name);
		}
	}*/
		for(String name : names) {
		if(pr.test(name)) {
			System.out.println(name);
		}

}
}}