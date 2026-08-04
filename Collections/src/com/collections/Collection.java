package com.collections;

import java.util.*;

//1
//class Employee{
//	
//
//	String firstName;
//	String lastName;
//	Employee(String firstName, String lastName){
//		this.firstName= firstName;
//		this.lastName = lastName;
//	}
//	
//	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Employee e2 = (Employee) obj;
//		
//		return this.firstName.equals(e2.firstName) && this.lastName.equals(e2.lastName);
//		
//	}
//	
//	
//	@Override
//	public int hashCode() {
//		
//		return (this.firstName + this.lastName).hashCode();
//	}
//	
//
//}



//class Ayush{
//	
//	@Override
//	public int hashCode(){
//		return 1234567;
//	}
//}



// treeset compareable overriden
//class Ayushh implements Comparable<Ayushh>{
//	
//	String name;
//	public Ayushh(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public int compareTo(Ayushh a) {
//		
//		
//		int ans=  this.name.compareTo(a.name);
//		System.out.println(ans);
//		return ans;
//	}
//}










public class Collection {
	
	public static void main(String[] args) {
//		1
//		Employee e1 = new Employee("Ayush", "Raj");
//		
//		Employee e2 = new Employee("Ayush", "Raj");   // equals checking content bcz we have overided it, if we wont override it
														// then it will check for the reference by default
		
		//Employee e2 = new Employee("A", "R");     // false
		//Employee e2 = new Employee("Ayush", "R");  // false
		
//		System.out.println(e1==e2);
//		
//		System.out.println(e1.equals(e2));
//		
		
		
//		System.out.println("e1 hashcode ->" + e1.hashCode());
//		System.out.println("e1 hashcode ->" + e2.hashCode());
		
		
		
		// hashcode is nothing but a unique number which is given to the each object by JVM
		// hashcode is of integer type (should be -ve as well as +ve)
		
		// if two objects are equals then they have the same hashcode
		// if two objects returns the same hascode code that does not mean they are equals 
		
		
//		String s1 = "Ayush";
//		String s2 = new String("Raj");
//		
//		System.out.println("-----------------");
//
//		System.out.println("s1 hashcode ->" + s1.hashCode());
//		System.out.println("s2 hashcode ->" + s2.hashCode());
		
		
//		-------------------------------------------------------------------------------------------
		
		// Different object but they are having same hashCode  which is also known as 'HASH-COLLISION';
		
//		String s11 = "FB";
//        String s21 = "Ea";
//
//        System.out.println(s11.hashCode());
//        System.out.println(s21.hashCode());
//
//        System.out.println("Hash collision -> " +s11.equals(s21));
		
//		----------------------------------------------------------------------------------------------
		
		
		
		
		
//		March 17 (About set)
		
//		---   Default hashSet size = 16;     0-15  index
//		--- to find index   ->  ayush.hashcode &(operator) size (15)  
		
		
//		--> each time we are adding element inside the set a node will be created for it
		
//		if hashcode is same but the object is different then (checked internally using the 'equals method') , for a single index we do have to collect different
//		object on the same index for this it is using (doubly) linkedlinked internally   -> we called it hashCollsion
		
		
//		O(1)  ADDING element if no collision,  if collision then  O(n)  here n is number of collision
		
//		thats why we dont have get method we have contains methods that will return either true or false
		
//		O(1) for checking the element 
		
		
		
//		HashSet<String> set = new HashSet<String>();    // by default bucket size is 16  (0-15) index
//		
//		set.add("chennai");     -> this element acts as a key and for this a dummy object will be created as a value
//		set.add("banglore");				bcz internally it is using the hashMap
//		set.add("andhara");
//		set.add("tamilnadu");
//		
//		System.out.println(set);
//		
//		set.add("banglore");
//		
//		System.out.println(set);
//		
//		System.out.println("banglore" .hashCode());
		
		
	
//		-----------------------------------------------------------------------
//		March 18th
		
		
		
//		Question 1
//		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("Banglore");
//		set.add("Chennai");
//		set.add("Delhi");
//		set.add("Bihar");
//		set.add("Gujarat");
//		set.add("MP");
//		set.add("Bhopal");
//		set.add("Ahm");
//		set.add("Asssam");
//		set.add("Jaipur");
//		set.add("Himachal");
//		set.add("Gzb");
//		
//	System.out.println(set);
//		
//		set.add("Up");
//		
//		System.out.println(set);
		
		
		
//		2nd Question first way
//		
//		HashSet<String> set = new HashSet<String>(64);
//		
//		set.add("FB");
//		set.add("Ea");
//		
//		System.out.println("FB".hashCode());
//		System.out.println("Ea".hashCode());
//		
//		int fb_hashcode = "FB".hashCode();
//		
//		int index_fb = (fb_hashcode) & 63;
//		System.out.println(index_fb);
//		
//		int Ea_hashcode = "Ea".hashCode();
//		System.out.println(Ea_hashcode);
//		
//		int index_Ea = (Ea_hashcode) & 63;
//		System.out.println(index_Ea);
//		
//		if(index_fb == index_Ea) {
//			System.out.println("There is a hashCollision ");
//		}
		
		
		
		
		// size should be 64
		// collision less than 4 converted to linkedlist
		// collision more than 8 then linkedlist converted to balanced tree    (this is called terify feature introduced in java 8)  
		
		
		
		
		
//		HashSet<Ayush> set = new HashSet<Ayush>(64);
//		
//		set.add(new Ayush());
//		set.add(new Ayush());
//		set.add(new Ayush());
//		set.add(new Ayush());
//		set.add(new Ayush());
//		set.add(new Ayush());
//		set.add(new Ayush());
//		set.add(new Ayush());
//		
//		
//		System.out.println(set);
//		
//		set.add(new Ayush());
//		
//		System.out.println(set);
		
		
		
		
		
		
//		HashSet<String> hashset = new HashSet<String>();
//		
//		hashset.add("abc");
//		hashset.add("def");
//		hashset.add("ghi");
//		hashset.add("jkl");
//		hashset.add("mno");
//		hashset.add("pqr");
//		hashset.add("stu");
//		hashset.add("vwx");
//		hashset.add("banglore");
//		hashset.add("chennai");
//		hashset.add("gujarat");
//		hashset.add("delhi");
//		
//		
//		System.out.println("The size of the hashset is -> " + hashset.size());
//		
//		System.out.println("----------------");
//		System.out.println(hashset);
//		
//		hashset.add("Bihar");
//		
//		System.out.println("");
//		System.out.println("The size of the hashset is -> " + hashset.size());
//		System.out.println("----------------");
//		System.out.println(hashset);
		
		
		//why 75%
		
//		50% -> less collision but wastage of the space(50% always empty);
//		
//		100% -> more collision but solw in th performance 
//		
//		75% -> is the best 
		
//		
//		----------------------------------------------------
//		
//		HashSet<String> hashset = new HashSet<String>(16, 0.50f);
//		
//		hashset.add("abc");
//		hashset.add("def");
//		hashset.add("ghi");
//		hashset.add("jkl");
//		hashset.add("mno");
//		hashset.add("pqr");
//		hashset.add("stu");
//		hashset.add("vwx");
//		
//		
//		
//		System.out.println("The size of the hashset is -> " + hashset.size());
//		
//		System.out.println("----------------");
//		System.out.println(hashset);
//		
//		hashset.add("zzz");
//		
//		System.out.println("");
//		System.out.println("The size of the hashset is -> " + hashset.size());
//		System.out.println("----------------");
//		System.out.println(hashset);
		
		
		
		
		
		
//		24TH MARCH     ----->   LinkedHashSet   -->Talks about meta detail(detail about a node)
		
		
		
		
//		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
//		
//		linkedHashSet.add("Banglore");
//		linkedHashSet.add("Hyderabad");
//		linkedHashSet.add("Delhi");
//		linkedHashSet.add("Patna");
//		linkedHashSet.add("Assam");
//		linkedHashSet.add("Jaipur");
//		linkedHashSet.add("abc");
//		linkedHashSet.add("ghi");
//		linkedHashSet.add("def");
//		linkedHashSet.add("jkl");
//		linkedHashSet.add("mno");
//		linkedHashSet.add("pqr");
//		
//		
//		System.out.println(linkedHashSet);
//		
//		
//		linkedHashSet.add("stu");
//		
//		System.out.println(linkedHashSet);
		
		
		
		
		
		
		
//		-------------------------------------------------------------------
		
//		TREEsET  -->   MAINTAINS AN ORDER BYDEFAULT ASCENDING 
//		TreeSet will not allow null   -> we will get nullPointerException
//		Similar datatypes  -> bcz it follows compareTo method
//		
//		"XYZ".compareTo("ABC")  ->  +ve value which indicates  --> First "ABC" will come
		
//		** class should be comparable before you add to treeSet
		
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("abc");
		tree.add("xxyz");
		tree.add("jkl");
		tree.add("mno");
		tree.add("bbb");
		tree.add("bbb");
		//tree.add(null);   --> not allowed in this treeSet
		
		
		tree.stream().forEach(value -> System.out.println(value));
		
		
		
		
		
//		TreeSet<Ayushh> a = new TreeSet<Ayushh>();
//		
//		a.add(new Ayushh("jzz"));
//		a.add(new Ayushh ("def"));
//		a.add(new Ayushh ("abc"));
//		
//		a.stream().forEach(name -> System.out.println(name.name));
//		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}









































