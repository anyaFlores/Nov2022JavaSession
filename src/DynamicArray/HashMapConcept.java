package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap - dynamic storage(collection)
		//store the value on the base of values: <key,value>
		//name =naveen
		//marks = 100
		//seller= seller@gmail.com
		//does Not maintain the order
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("Naveen", "SDET");
		empMap.put("Anya", "SDET1");
		empMap.put("Rashmi", "SDET2");
		empMap.put("Ravi", "SDET Manager");
		empMap.put("Kareem", "CEO");
		empMap.put("Kareem", "CEO");
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");
		empMap.put(null, null);
		
		
		System.out.println(	empMap.get("Rashmi"));
		System.out.println(	empMap.get("Kareem"));
		System.out.println(	empMap.get("Tom"));
		System.out.println(empMap.get("Sheela"));
		System.out.println(empMap.get(null));
		
		System.out.println(empMap);
	
		
		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();
		
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);
		
		System.out.println();
		
	}

}
