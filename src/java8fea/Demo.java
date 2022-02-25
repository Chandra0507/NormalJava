package java8fea;

@FunctionalInterface
interface Calculator {
	int m1(int a, int b);

	default void m2() {
		System.out.println("this is m2");
	}

	static void m3() {
		System.out.println("this is m3");
	}

}

public class Demo {
	public static void main(String[] args) {
//		Calculator calc = (a,b) ->{
//		return b-a;
//		};
//		System.out.println(calc.m1(10,5));
//		
		// () -> {body}
		Calculator calc = (a,b)-> b-a;
		System.out.println(calc.m1(10,5));
	
}}
