package java8fea;

import java.util.function.Predicate;

//joining multiple predicates
	//check the number is even or not
	//check the number is greater than 50
public class Demo3 {

	public static void main(String[] args) {
		int a [] = {10,20,30,45,50,60,65,70};
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>50;
		for(int n:a) {
			//if(p1.test(n)&& p2.test(n))
//			if(p1.and(p2).test(n)){
//				System.out.println(n);
//			}
			if(p1.negate().test(n)) {        //negate will print opposite to the o/p
				System.out.println(n);
			}
		
		}
	}

}
