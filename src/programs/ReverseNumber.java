package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=567;
		int rev=0;
		int lastdigit;
		while(n>0) {
			lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}
		System.out.println(rev);
	}

}
