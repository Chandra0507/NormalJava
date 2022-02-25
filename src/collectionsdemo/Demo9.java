package collectionsdemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Demo9 {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
			p.add("A");
			p.add("B");
			p.add("c");
			p.offer("7");
			System.out.println(p);//insrtion order preserved dupli alloewd
				//get hed element() peak()
			//System.out.println(p.element());
			//System.out.println(p.peek());
		
				//if que is empty
			//System.out.println(p.element()); //----exception
			//System.out.println(p.peek()); //--------null
				
				//return and remove element from Queue remove() , poll()
		/*System.out.println(p.remove());
		System.out.println(p);
		System.out.println(p.poll()); 
		System.out.println(p);*/
		
		//when que is empty at that time what is the diff b/w remove and poll
		//System.out.println(p.remove()); //------Exception
		//System.out.println(p.poll());	  //------null	
			
			/*System.out.println("Reading Queue values by using Iterartot");
			Iterator it = p.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}*/
		/*	System.out.println("Reading Queue values by using foe each loop");
			for(Object o : p) {
				System.out.println(o);
			}*/
	}

}
