package listconcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String, String> map1=new HashMap<String,String>();
    map1.put("1", "A");
    map1.put("2", "B");
    map1.put("3", "C");
    
    
    Map<String, String> syncMap = Collections.synchronizedMap(map1);
    System.out.println(syncMap);
    
    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
    concurrentHashMap.put("A", "Java");
    concurrentHashMap.put("B", "Pyton");
    System.out.println(concurrentHashMap.get("A"));
	}

}
