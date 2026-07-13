package com.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;



//class Ayush implements Comparable<Ayush>{
//	
//	String name ;
//	
//	Ayush(String name){
//		this.name = name;
//	}
//	
//	@Override
//	public int compareTo(Ayush a) {
//		
//		return this.name.compareTo(a.name);
//		
//	}
//	@Override
//    public String toString() {
//        return name;
//    }
//	
//}







class Employee {
	
	private String name;
	private int salary;
	
	Employee(String name, int  salary){
		this.name = name;
		this.salary = salary;
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}


















public class Map {
	
	public static void main(String[] args) {
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		
//		map.put("Banglore", 2 );
//		map.put("Bihar", 2 );
//		map.put("hyderabad", 5 );
//		map.put("Jaipur", 20 );
//		map.put("Mumbai", 5);
//		map.put("Ayush", 0);
//		map.put("Banglore", 34);
//		map.put("abc",90);
//		
//		System.out.println("Result using HashMap which is in unorder");
//		System.out.println(map);
//		
//		System.out.println("-----------------------------");
//		
//		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
//		
//		linkedHashMap.put("Banglore", 2 );
//		linkedHashMap.put("Bihar", 2 );
//		linkedHashMap.put("hyderabad", 5 );
//		linkedHashMap.put("Jaipur", 20 );
//		linkedHashMap.put("Mumbai", 5);
//		linkedHashMap.put("Ayush", 0);
//		linkedHashMap.put("Banglore", 34);
//		linkedHashMap.put("abc", 90);
//		
//		System.out.println("Result using LinkedHashMap which is in order");
//		
//		System.out.println(linkedHashMap);
//		
//		System.out.println("----------------------------------------");
//		
//		
//		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
//		
//		treeMap.put("Banglore", 2 );
//		treeMap.put("Bihar", 2 );
//		treeMap.put("hyderabad", 5 );
//		treeMap.put("Jaipur", 20 );
//		treeMap.put("Mumbai", 5);
//		treeMap.put("Ayush", 0);
//		treeMap.put("Banglore", 34);
//		treeMap.put("Abc", 90);
//		
//		System.out.println("Result using treeMap which is in Sortedorder(Ascending)");
//		
//		System.out.println(treeMap);
//		
//		System.out.println("----------------------------------------");
		
		
//		Set<Entry<String, Integer>> entry = treeMap.entrySet();
//				
//				Iterator<Entry<String, Integer>> itr = entry.iterator();
//				
//				while(itr.hasNext()) {
//					Entry<String, Integer> entry1 = itr.next();
//					String key = entry1.getKey();
//					Integer value = entry1.getValue();
//					
//					System.out.println("The key is -> "+ key + " --and the value is -> " + value);
//					
//					
//					
//				}
		
		
		
		
//		TreeMap<Ayush, Ayush> tree = new TreeMap<Ayush, Ayush>();
//		
//		tree.put(new Ayush("Ayush"), new Ayush("Raj"));
//		tree.put(new Ayush("Raj"), new Ayush("Ayush"));
//		
//		tree.put(new Ayush("Abc"), new Ayush("Xyz"));
//		
//		System.out.println("TreeMap using custom object");
//		
//		
//		Set<Entry<Ayush, Ayush>> entry1 = tree.entrySet();
//		
//		Iterator<Entry<Ayush, Ayush>> itr1 = entry1.iterator();
//		
//		while(itr1.hasNext()) {
//			Entry<Ayush, Ayush> entry2 = itr1.next();
//			Ayush key = entry2.getKey();
//			Ayush value = entry2.getValue();
//			
//			System.out.println("The key is -> "+ key + " and the value is -> " + value);
//			
//			
//			
//		}
//		
//		
//		System.out.println("------------------------");
		
		
		
		// arry list -> 10 elem  during iteration we have to remove one or two elements
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		list.add(3);
//		list.add(5);
//		list.add(1);
//		list.add(7);
//		list.add(10);
//		list.add(76);
//		list.add(0);
//		list.add(54);
//		list.add(32);
//		list.add(-9);
//		
//		//System.out.println(list.size());
//		
//		
//		System.out.println(list);
//		
//		for(Integer value : list) {
//			
//			list.remove(3);    // adding and remove while iterating (ConcurrentModificationException) -> this is failfast
//								//	and most of the collections are failfast  IF NOT THROWING ANY EXCEPTION then it is failSafe
//		}
		
		
		
		
		
		// FAIL-SAFE
		
//		List<String> list1 = new CopyOnWriteArrayList<String>();
//		list1.add("Banglore");
//		list1.add("hyderabad");
//		
//		for(String str: list1) {
//			
//			System.out.println(str);
//			list1.add("Bihar");
//			
//		}
//		
//		System.out.println("-------------------");
//		System.out.println("After modification printing all elements");
//		
//		for(String val : list1) {
//			System.out.println(val);
//		}
		
		
		
		
		
		
		
		
		
		
//		--> for failSafe just go for iterator
	// iterator will only move to forward  (works for all collections except map)
		
		// listIiterator  -> works only with list  (it has prev and next method move forward/backward) 
		
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(5);
//		list.add(99);
//		list.add(-90);
//		
//		Iterator<Integer> itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			
//			int value = itr.next();
//			
//			System.out.println(value);
//			
//			itr.remove();
//			
//			
//		}
		
		


		
		
//--------------------------------------------------------------------		
//		SynchronizedHashMap -> lock everything
//		concurentHashMap  ->  wont lock everything
//		java 5 -> concurrentHashMap  (Segment based)
//		java 8 -> concurrentHashMap  (CAS (Compare And Swap) based) --> In  concurrent programming to
																//achieve thread safety without heavy locking
		

		
		
		
		
		
//		
//		-------------------------------------------------------------------------------------------------------
//					COMPARABLE AND COMPARATOR               27TH MARCH
//		--------------------------------------------------------------------------------------------------
		
//		-> comparable  -> has -> compareTo method   -> here we have to to modify the actual class (internal sorting)
//		-> comparator  -> has -> compare method   -> external sorting, we are not modifying the actual class  (Multi field sorting)
		
		
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Raj", 3000);
		Employee e2 = new Employee("Ayush", 5000);
		
		list.add(e1);
		list.add(e2);
		
		System.out.println("Name sorting");
		
		Collections.sort(list, new NameComparator());
		
		
		for(Employee e : list) {
			
			System.out.println("Name is ->" + e.getName() + " Salary is -> " + e.getSalary());
		}
		
		
		
		System.out.println("Salary sorting");
		
		Collections.sort(list, new SalaryComparator());
		
		
		for(Employee e : list) {
			
			System.out.println("Name is ->" + e.getName() + " Salary is -> " + e.getSalary());
		}
		
		
		
// sealed class java 17  (to control the inheritances)   
// Record class  java 16    ->  there is no need to write any constructor , getters, setters for the class ,
						// everything is availabe inside the record class
		
		
		
		
		
		
	}

}





















