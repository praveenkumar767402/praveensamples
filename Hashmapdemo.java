package xyz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapdemo {

	public static void main(String[] args) {
		  HashMap<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("apple", 5);
	        hashMap.put("banana", 13);
	        hashMap.put("cherry", 8);
	        int appleCount = hashMap.get("apple");
	        int cherryCount = hashMap.get("cherry");
	        System.out.println("Apple count: " + appleCount); 
	        System.out.println("Cherry count: " + cherryCount);
	        for (Entry<String, Integer> entry : hashMap.entrySet()) 
	        {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        
	        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
	        linkedHashMap.put("apple", 5);
	        linkedHashMap.put("banana", 13);
	        linkedHashMap.put("cherry", 8);
	        int appleCount1 = linkedHashMap.get("apple");
	        int cherryCount1 = linkedHashMap.get("cherry");
	        System.out.println("Apple count: " + appleCount1);
	        System.out.println("Cherry count: " + cherryCount1);
	        for (Entry<String, Integer> entry : linkedHashMap.entrySet())
	        {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
		   }  
		}  
	


