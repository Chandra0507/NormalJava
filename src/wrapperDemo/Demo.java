package wrapperDemo;

public class Demo {

	public static void main(String[] args) {
		/*int x = 20;
		//Integer y = Integer.valueOf(x);-----legacy
		Integer y = x;//autoboxing(converting one data type into object automatically is called AB)
		System.out.println(y);*/
		
			//obj creating then convert into data type
		Integer x = new Integer(30);//--these Integer constructed is deleted(deprecated) 
		//System.out.println(x);
		int y = x;
		System.out.println(y);
	}

}
