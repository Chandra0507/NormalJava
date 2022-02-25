package java8fea;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String name;
	int salary;
	int experiance;
	public Employee(String nam, int sal, int exp) {
		name=nam;
		salary=sal;
		experiance=exp;
	}
	public static void main(String[] args) {
		Employee emp= new Employee("mahi", 50000, 10);
		//if sal>30k and exp > 6 print name
		Predicate<Employee> p= e->(e.salary>30000 && e.experiance>6);
		System.out.println(p.test(emp));
		//Ex 2
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("john", 40000, 8));
		al.add(new Employee("David",35000,9));
		al.add(new Employee("martin",20000,5));
		for(Employee e:al) {
			//if(p.test(e))
			if(e.salary>30000 && e.experiance>6){
				System.out.println(e.name);
			}
		}
	}

}
