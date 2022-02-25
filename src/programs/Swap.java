package programs;

public class Swap {

	public static void main(String[] args) {
		/*int a=10;
		int b=20;
		int c=a+b;
		a=c-a;
		b=c-a;
		System.out.println(a);
		System.out.println(b);*/
		
		//Using third variable
		int a=10;
		int b=20;
		int c;
		c=b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);
	}

}
