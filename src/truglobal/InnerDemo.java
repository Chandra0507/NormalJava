package truglobal;

import truglobal.OuterClass.Inner;

class OuterClass //OuterClass----------filename
{  
	int a;
	public void show()
	{
		System.out.println("show in outer");
	}
	 class Inner  //OuterClass$Inner-----------filename
	{
		void display()
		{
			System.out.println("display in inner");
		}
	}
}
public class InnerDemo              //InnerDemo--------filename
{
	public static void main(String[] args) 
	{
		OuterClass oc=new OuterClass();
		OuterClass.Inner oc1=oc.new Inner();
		oc1.display();
	}
}


