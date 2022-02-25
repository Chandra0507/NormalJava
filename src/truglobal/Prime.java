package truglobal;

public class Prime {
	public static void main(String[] args) {
		for(int i=10;i<=200000;i++){
			boolean prime = true;
			for(int j = 2; j<i; j++){
				if(i%2==0 || i%3 ==0 || i%4==0|| i%5==0|| i%6==0 || i%7==0 || i%8==0 || i%9==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println(i);
			}
	}
}}
