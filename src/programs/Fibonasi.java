package programs;

public class Fibonasi {

	public static void main(String[] args) {
		int n=10;
		int f=1;
		int s=1;
		int t;
		System.out.print(f+" ");
		System.out.print(s+" ");
		for(int i=3;i<=n;i++ ) {
			t=f+s;
		
			System.out.print(t+" ");
			f=s;
			s=t;
		}
	}
}

