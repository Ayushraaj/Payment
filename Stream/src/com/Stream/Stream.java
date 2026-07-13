package com.Stream;

import java.util.stream.*;
import java.util.*;

// 30th march

//Stream Api introduced in JAVA 8
//-> difference between collection and Stream?
//--> collection is used to store the data , where as Stream is used to process the data which is stored in the collections


//Step  -> 1. convert the collection to stream object
//step  -> 2. perform operations
// step -> 3. collect the data back



//class Employee {
//    String name;
//    double salary;
//    
//    Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//    
//    String getName() {
//    	return name;
//    }
//    
//    double getSalary() { 
//    	return salary;
//    }
//}



public class Stream {

	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("banglore");
//		list.add("delhi");
//		list.add("hyderabad");
//		
//		
//		List<String> output = list.stream().map(items -> items.toUpperCase()).collect(Collectors.toList());
//		
//		System.out.println(output);
//		
//		
//		list.stream().map(items -> items.toLowerCase()).forEach(items -> System.out.println(items));
		
		
//		----> flatMap
//		List<List<String>> list = Arrays.asList(
//	            Arrays.asList("Apple", "cherry"),
//	            Arrays.asList("Abc", "Def")
//	        );
//
//	        list.stream()
//	            .flatMap(l -> l.stream())
//	            .filter(element -> element.startsWith("A"))
//	            .forEach(element -> System.out.println(element));
		
		
//************************************	
//31st march	
//***********************************	



//		Intermediate operations
//				-> Stream as input -> Apply operations -> Stream as output (can be called multiple times)  (size can be reduced)
//		
//		Terminal operation
//				-> Stream as an input -> Apply Terminal Operation -> Result  (will be called only once)  (size cannot reduced)
		
//	**************************	
		
		
		
		
		
		
//		List<String> cities = Arrays.asList("Banglore", "Chennai", "Hyderabad", "Delhi", "Mumbai", "Goa");
//		
//		
//		// cities with length 5 or more than 5
//
//		cities.stream()
//		.filter(city -> city.length()>=5)
//		.map(city -> city.toUpperCase())
//		.forEach(city -> System.out.println(city));
//		
//		
//		System.out.println("---------------");
//		// as list
//		
//		List<String> newcity = cities.stream()
//		.filter(city -> city.length()>=5)
//		.map(city -> city.toUpperCase())
//		.collect(Collectors.toList());
//		
//		System.out.println(newcity);
		
		
		
		//--> Quesiton -: find the square of all even number in a given list
		
		
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		list.stream()
//		.filter(number -> number%2==0)
//		.map(number -> number*number)
//		.forEach(number -> System.out.println(number));
//		
//		
//		
//		System.out.println("Printing as a list");
//		System.out.println("------------");
//		
//		List<Integer> even_no_with_square = list.stream()
//				.filter(number -> number%2==0)
//				.map(number -> number*number)
//				.collect(Collectors.toList());
//		System.out.println(even_no_with_square);
		
		
		
		
		
		
//	**********************************************	
//		------>  nested list/ stream as input    -> flatMap  ->  1D  (flatten the nested structure)
		
//*************************************************		
		
//		Question -> find the city whose len is more than 5
		
		
//		List<List<String>> cities = Arrays.asList(
//				
//				Arrays.asList("Chennai", "Banglore"),
//				Arrays.asList("Delhi", "Mumbai"),
//				Arrays.asList("Kolkata", "Hyderabad")
//				
//				);
//		
//		
//		System.out.println(cities);
//		System.out.println("-----------------");
//		
//		System.out.println("Just printing");
//		System.out.println("len greater or equals 5 city");
//		
//		
//		cities.stream()
//		.flatMap(city -> city.stream())
//		.forEach(city -> System.out.println(city));
//		
//		
//		System.out.println("-----------------");
//		System.out.println("Printing as list");
//		
//		List<String> new_city = cities.stream()
//				.flatMap(city -> city.stream())
//				.collect(Collectors.toList());
//		System.out.println(new_city);
		
		
		
		
		
		
		
		
//********************		
//		Date 1st April
//***********************
		
		
		
		
//		Question -> write a program to find even number from a given nest list of int
		
//		List<List<Integer>> list = Arrays.asList(
//				
//				Arrays.asList(1,2,3,4,5,6),
//				Arrays.asList(7,8,9,10,11),
//				Arrays.asList(12,13,14,15)
//				
//				);
//		System.out.println("Original list");
//		System.out.println(list);
//		
//		System.out.println("Printing");
//		list.stream().flatMap(element -> element.stream()).filter(element -> element%2==0).forEach(element -> System.out.println(element));
//		
//		System.out.println("Printing as list");
//		List<Integer> list1  = list.stream().flatMap(element -> element.stream()).filter(element -> element%2==0).collect(Collectors.toList());
//		System.out.println(list1);
		
		
		
		

		
//		** uses of distinct (it removes the duplicates values)
//		
//		List<String> list = Arrays.asList("Ayush", "Ayush", "Raj");
//		
//		list.stream().distinct().forEach(name -> System.out.println(name));
//		
		
		
//		** skip  -> skip the number of elements
//		** findFirst  -> always return the first element  (it is optional that's why it has get())
		
		
		
//		List<String> list = Arrays.asList("abc","def","ghi", "abc");
//		
//		System.out.println("-----------------------------");
//		System.out.println("Skipping 3 element from the list");
//		list.stream().skip(3).forEach(item -> System.out.println(item));
//		
//		System.out.println("-----------------------------");
//		System.out.println("Printing the first element from the list");
//		Optional<String> first_element = list.stream().findFirst();
//		System.out.println("Without using get ->  " + first_element);
//		System.out.println("With using the get -> " + first_element.get());
//		
//		System.out.println("-----------------------------");
//		System.out.println("Limit for 3 elements");
//		list.stream().limit(3).forEach(item -> System.out.println(item));
//		
//		System.out.println("-----------------------------");
//		System.out.println("Using default sorting (Ascending order based oN ASCII values");
//		
//		list.stream().sorted().forEach(item -> System.out.println(item));
//		
//		
//		System.out.println("-----------------------------");
//		System.out.println("Custom sorting");
//		
//		list.stream().sorted((a,b) -> a.length() - b.length()).forEach(item -> System.out.println(item));
//		
//		
		
		
//		** Question -> list of employee salary, need to find second highest salary
//		** Interview fav ):
		
//		
//		List<Integer> salary = Arrays.asList(1000, 20000, 30000, 4000, 10, 1000);
//		
//		System.out.println("The second highest salary is ");
//		Optional<Integer> second_highest = salary.stream().sorted((a,b) -> b-a).distinct().skip(1).findFirst();
//		
//		System.out.println(second_highest.get());
		
		
		
		
		
		
//		Question -> list of strings,find the duplicates word 
		
//		
//		List<String> list = Arrays.asList("banglore" , "hyderabad", "banglore", "chennai", "delhi");
//		
//		Set<String> set = new HashSet<String>();
//		
//
//		list.stream().filter(items -> !set.add(items)).forEach(item -> System.out.println(item));
//		
//		
		
		
//  ****************************
//  2nd April
//  ****************************
		
		
//		Question -> 3rd lowest salary
		
		
//		List<Integer> salary = Arrays.asList(100, 500, 10,10, 90, 1000);
//		
//		Optional<Integer> third_lowest = salary.stream().sorted((a,b) -> a-b).distinct().skip(2).findFirst();
//		
//		System.out.println(third_lowest.get());
		
		
		
//    Question -> find max and min
		
//		List<Integer> list = Arrays.asList(98, 1,2,3,64,33,99);
//		
//		System.out.println(list);
//		
//		Optional<Integer> min_value = list.stream().min((a,b) -> a-b);
//		
//		System.out.println("Min value in the list is -> " +min_value.get());
		
		
//***  total number of element -> Collectors.counting()		
		
//		System.out.println("Total elements in the list ->" + list.stream().collect(Collectors.counting()));
//		
		
		
		//partitioningBy
		
		
//		// true=[98, 64, 33, 99] this is how the return type looks like
//		Map<Boolean, List<Integer>> greater_then_five = list.stream().collect(Collectors.partitioningBy(number-> number>5));
//		
//		System.out.println(greater_then_five);
		
		
		
		
		// groupBy
		
		
//		List<String> list = Arrays.asList("Bihar", "Punjab", "Harayana","Chandigarh", "Banglore", "Bhopal", "Chicago");
//		
//		Map<Integer, List<String>> grouped_cities =list.stream().collect(Collectors.groupingBy(names -> names.length()));
//		
//		System.out.println(grouped_cities);
		
		
		
//????????		Question -> find the frequency of each char in given string
		
		//String name = "Ayush";
		
	
		
//		Question find non-repeating char
		
//		String city = "swiss";
//		
//		city.chars().mapToObj(character -> (char) character).forEach(c -> System.out.println(c));
//		
//		char ans =city.chars().mapToObj(character -> (char) character).filter(c -> city.indexOf(c)==city.lastIndexOf(c)).findFirst().get();
//		
//		System.out.println("first non repeating char is -> " +ans);
		
		
		// Question sort the given list by the word length
		
//		List<String> list = Arrays.asList("WashigatonDc", "Punjab", "Harayana","Chandigarh");
//		
//		List<String> sorted_list = list.stream().sorted((a,b) -> a.length()- b.length()).collect(Collectors.toList());
//		
//		System.out.println(sorted_list);
		
		
		
//		Question  reverse all the words
//		List<String> list = Arrays.asList("WashigatonDc", "Punjab", "Harayana","Chandigarh");
//		
//		List<StringBuilder> ans = list.stream().map(names -> new StringBuilder(names).reverse()).collect(Collectors.toList());
//		
//		System.out.println(ans);
		
		
//		emp object name and salary , find which emp get second highest salary
		
		
//		List<Employee> empList = Arrays.asList(
//	            new Employee("Ayush", 6000),
//	            new Employee("Anish", 8000),
//	            new Employee("Komal", 7000),
//	            new Employee("Aditi", 6000)
//	        );
		
//		Optional<Double> ans = empList.stream()
//		        .map(emp -> emp.salary)         
//		        .distinct()                     
//		        .sorted(Comparator.reverseOrder()) 
//		        .skip(1)                        
//		        .findFirst();    
//		System.out.println(ans.get());
		
//		System.out.println("-------------------");
//		
//		Optional<Employee> ans1 = empList.stream()
//		        .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
//		        .distinct()
//		        .skip(1)
//		        .findFirst();
//
//		ans1.ifPresent(e -> 
//		    System.out.println(" Emp with the second highest salary is -> " + e.name +",  with a salary of " + e.salary));

		
		
		

//************************
//3rd April
//************************
	
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		Advantage of stream api
//		1. performace(bcz of lazy loading)
//		less code
//		
//		
//		disadvantage 
//		1. hard to debug
//		2. code is not readable
		
		
		
		
//		****method reference
//		Question --> write a program to first non repeating car from a given string
		
		
//		String s = "swiss";
//		
//		//s.chars().parallel().mapToObj(c ->(char) c).filter(c -> s.indexOf(c)== s.lastIndexOf(c)).forEach(c -> System.out.println(c));
//		
//		
//		char a =s.chars().parallel().mapToObj(c ->(char) c).filter(c -> s.indexOf(c)== s.lastIndexOf(c)).findFirst().get();
//		
//		System.out.println(a);
		
	
		
	}
	
	
}
