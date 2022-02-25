package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
					//Declaring ArrayList
		
		//ArrayList<Integer> a = new ArrayList<>(); --------it stores integer type data
		//ArrayList<String> a = new ArrayList<>();  --------it stores string type data
		//List a = new ArrayList(); ---------it will accept bcz List is a parent interface of the AL
		ArrayList al=new ArrayList();   //-------- it will store any type of data
		al.add(100);
		al.add("hloo");
		al.add(2.6);
		al.add('d');
		System.out.println(al);
		
		//delete particular obj
		al.remove(2.6);  //-----directly by using obj
		al.remove(1);   //------by using index number
		System.out.println("after removing elements from Al is :" + al);
		System.out.println(al.size());  //--------- it returns the size of the element
		System.out.println(al.isEmpty()); //-------- it checks whether AL is empty or not it retuns boolean value
		
		//Add ------insert a new element
		al.add("false"); //------it will add at the end of the arraylist
		al.add(1, "hii");
		System.out.println("after adding the AL is : " + al);//[100, hii, d, false]
		
		//Retreive the particular object
		System.out.println(al.get(1));
		//Change is existing value/Replacing
		al.set(1, "hloo");
		System.out.println("after replacing" + al);
		//Search --contains()---it returns boolean value
		System.out.println(al.contains("false"));
		
		//to read all the elements present in the array list is 
		
		//for loop
		/*System.out.println("reading data by using for loop");
		for(int i=0;i<=al.size();i++) {
		System.out.println(al.get(i));
		}*/
		
		//for each loop
		/*System.out.println("reading the data by using for each loop");
		for(Object a :al) {
			System.out.println(a);
		}*/
		    //iterator()
		System.out.println("reading the data by using iterator method");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
