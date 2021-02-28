package listconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LLConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll = new LinkedList<String>();
ll.add("test");
ll.add("selenium");
ll.add("qa");
ll.add("rpa");
//print
System.out.println(ll);
ll.addFirst("naveen");
ll.addLast("automation");

System.out.println(ll);
System.out.println(ll.get(0));
ll.set(0, "tom");
System.out.println(ll);

ll.removeFirst();
ll.removeFirst();
System.out.println(ll);

ll.remove(2);
System.out.println(ll);

//to print all values
//1.for loop
System.out.println("Using for loop");
for (int i = 0; i < ll.size(); i++) {
	System.out.println(ll.get(i));
}

//2.advance for loop
System.out.println("Using advanced foreach loop");
for(String str:ll){
	System.out.println(str);
}
//3.iterator
System.out.println("Using Iterator");
Iterator<String> it=ll.iterator();
while (it.hasNext()) {
	String str=it.next();
	System.out.println(str);
}
//while loop
System.out.println("Using while loop");
int n=0;
while (ll.size()>n) {
	System.out.println(ll.get(n));
	n++;
}
	}

}
