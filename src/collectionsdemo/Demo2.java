package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;


		//To convert array into ArrayList
public class Demo2 {

	public static void main(String[] args) {
		String [] arr = {"mahi","ms","yellow"};
		for(String s : arr) {
		System.out.println(s);	
		}
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}

}
