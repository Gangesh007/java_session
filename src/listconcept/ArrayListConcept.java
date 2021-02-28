package listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	//1.Contain duplicate values
	//2.maintain insertion order
	//3.Non-synchronized,AL is slow
	//4.allows you random access to fetch any element boz it's store the value in the basis of indexes.

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al =new ArrayList();
		al.add(100);
		al.add(20);
		al.add(40);

		System.out.println(al.size());

		al.add(50);
		al.add(89);
		al.add(50);
		al.add("Selenium");
		System.out.println(al.size());
		System.out.println(al.get(3));

		//to print all the values from array list
		//1.for loop
		//2.iterator
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		//non generic vs generic
		ArrayList<Integer> al1 =new ArrayList<Integer>();
		al1.add(2);
		al1.add(3);
		//al1.add("Java");




		ArrayList<E> al2 =new ArrayList<E>();
//Interview Question-->How to use Customize Class in Collection
		//Employee class Oject
		Employee e1 = new Employee("Gangesh", 30, "QA");
		Employee e2 = new Employee("Raj", 24, "Dev");
		Employee e3 = new Employee("Devijyot", 43, "Account");

		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);

		//Iterator to traverse the value
		Iterator<Employee> it = obj.iterator();
		while(it.hasNext()){
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		//***************

		//addAll()-->to merge two array list
		ArrayList<String> al3 =new ArrayList<String>();
		al3.add("test");
		al3.add("tdog");
		ArrayList<String> al5 =new ArrayList<String>();
		al5.add("god");
		al5.add("monkey");

		al3.addAll(al5);
		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}

		al3.removeAll(al5);
		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		
		//retainAll()--->Common value will value print
		
		ArrayList<String> al7 =new ArrayList<String>();
		al7.add("t");
		al3.add("tdog");
		ArrayList<String> al8 =new ArrayList<String>();
		al8.add("t");
		al8.add("monkey");
		
		al7.retainAll(al8);
		for (int i = 0; i < al7.size(); i++) {
			System.out.println(al7.get(i));
		}

	}

}
