package scan;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
	int a=sc.nextInt();
	System.out.println(a);
	System.out.println("enter second value");
	int b=sc.nextInt();
	System.out.println(b);
	//sc.close();
	int c=a+b;
	System.out.println(c);
	}

}
