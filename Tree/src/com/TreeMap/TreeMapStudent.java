package com.TreeMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Student implements Comparable<Student>{
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Student s) {
		//ascending order
		return this.name.compareTo(s.name);
		
		// descending order
		
		//return s.name.compareTo(this.name);
	}
}



public class TreeMapStudent {
	
	public static void main(String[] args) {
		TreeMap<Student, String> treeMap = new TreeMap<Student, String>();
		treeMap.put(new Student("Ayush"), "Raj");
		treeMap.put(new Student("Abc"), "def");
		System.out.println(treeMap);
		
		System.out.println("----");
		
		Set<Entry<Student, String>> entrySet = treeMap.entrySet();
		Iterator<Entry<Student, String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			
			
			Entry<Student, String> ans = itr.next();
			Student firstName = ans.getKey();
			String lastName = ans.getValue();
			
			System.out.println("FirstName: "+ firstName + ", LastName: "+ lastName);
		}
		
		
		
		
	}

}
