package java8fea;

import java.util.function.Function;

public class Demo4 {

	public static void main(String[] args) {
//		Function<Double,Double> f=n->n*n;
//		System.out.println(f.apply(8.8));
	Function<String,Integer> fn=s->s.length();
	System.out.println(fn.apply("hello java"));
	}

}
