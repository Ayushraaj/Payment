package com.TreeMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



// you cannot override the class as a comparable or comparator for String class 

public class Tree {
	
	public static void main(String[] args) {
	
	TreeMap<String, String> treeMap = new TreeMap<String, String>(Collections.reverseOrder());
	
	treeMap.put("Ayush", "Raj");
	treeMap.put("Abc", "Def");
	System.out.println(treeMap);
	
	System.out.println("-------------------------");
	
	Set<Entry<String, String>> entrySet = treeMap.entrySet();
	Iterator<Entry<String, String>> itr = entrySet.iterator();
	
	while(itr.hasNext()) {
		Entry<String, String> ans = itr.next();
		String firstName = ans.getKey();
		String lastName = ans.getValue();
		
		System.out.println("FirstName: " + firstName + ", LastName " + lastName);
	}
	
	
	
	}
	
	

}
