package listconcept;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitalization {
    static Map<String, Integer> marksMap;
    static{
    	marksMap= new HashMap<>();
    	marksMap.put("A", 100);
    	marksMap.put("B", 200);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //1.using HashMap Class
		HashMap<String, String> map1=new HashMap<>();
		Map<String, String> map2=new HashMap<>();
		
	//static way:static hash map
		System.out.println(HashMapInitalization.marksMap.get("A"));
	//3.IMMUTABLE WITH ONLY SINGLE ENTRY
		Map<String, Integer> map3=Collections.singletonMap("test",100);
		System.out.println(map3.get("test"));
		//map3.put("abc", 200);//UnsupportedOperationException
	//4.JDK 8:
		Map<String, String> map4 = (Map<String, String>) Stream.of(new String[][]{
			{"Tom","A Grade"},
			{"Naveen","A+ grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
	  System.out.println(map4.get("Tom"));
	  map4.put("Lisa", "A+ grade");
	  System.out.println(map4.get("Lisa"));
	  
	  //5.using Simple Entry
	  Map<String, String> map5 = (Map<String, String>) Stream.of(
			  new AbstractMap.SimpleEntry<>("Naveen","Java"),
			  new AbstractMap.SimpleEntry<>("Gangesh","Python")
			).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	  System.out.println(map5.get("Naveen"));
	  map5.put("Lisa", "A");
	  System.out.println(map5.get("Lisa"));
	  
	  //JDK 1.9
	  //empty map
	  //Map<String, String> emptyMap=Map.of();
	}

}
