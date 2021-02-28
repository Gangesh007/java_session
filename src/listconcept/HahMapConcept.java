package listconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class HahMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String, Integer> marks = new HashMap<String, Integer>();
 marks.put("Gangesh", 100);
 marks.put("Vijay", 200);
 marks.put("Ajay", 300);
 marks.put("Raj", 400);
 //marks.put(null, 500);
 System.out.println(marks.size());
 Iterator it = marks.entrySet().iterator();
 while (it.hasNext()) {
	Map.Entry pairs= (Map.Entry)it.next();
	System.out.println(pairs.getKey()+ "=" + pairs.getValue());;
	
}
 //option 1:by using lambda
marks.forEach((k,v) -> System.out.println(" key = " + k + " value = "+v));
 //convert hashmap into array list
 List<String> name= new ArrayList<String>(marks.keySet());
 System.out.println(name.size());
 for(String str: name){
	 System.out.println(str);
 }
 List<Integer> studentMarks= new ArrayList<Integer>(marks.values());
 System.out.println(studentMarks.size());
 for(Integer str2: studentMarks){
	 System.out.println(str2);
 }
 
 

	}

}
