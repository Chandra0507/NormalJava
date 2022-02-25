package abst;

public abstract class Phone {
	public static void call() {
		System.out.println("tjis is calling future");
	}
//	 Phone() {
//		this(1);
//	System.out.println("this is cons");
//	}
//	 Phone(int a){
//		System.out.println("this is second cons");
//	}
	public abstract void nokia();
	public abstract void redmi();
public static void main(String[] args) {
		Mobile m=new Mobile();
		m.call();
		m.nokia();
		m.redmi();
		}
}
 class Mobile extends Phone {
	 
	public void nokia() {
		System.out.println("it is nokia mobile");
	}
	public void redmi() {
		System.out.println("it is mi");
	}
	}


