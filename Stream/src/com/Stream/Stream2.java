package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
		

		//🟢 Level 1: Basic Operations (1–7)
		//1. Even Numbers


//		List<Integer> even = Arrays.asList(1,2,3,4,5,6,7);
//		even.stream().filter(number -> number%2==0).forEach(number -> System.out.println(number));




		//2. Odd Numbers

//		List<Integer> odd = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		odd.stream().filter(number -> number%2!=0).forEach(number -> System.out.println(number));

		//3. Square of Numbers
//
//		List<Integer> square = Arrays.asList(1,2,3,4,5,6,7,8);
//		square.stream().map(number -> number*number).forEach(number -> System.out.println(number));

		//4. Convert to Uppercase

//		List<String> upper_case = Arrays.asList("Ayush","Anish", "Achintya");
//		
//		upper_case.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		


		//👉 Count total number of elements in a list using Stream.
		
//		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
//		long count = number.stream().count();
//		System.out.println(count);



		//👉 Find the maximum number from a list.
		
//		List<Integer> max_number = Arrays.asList(1,2,4,3,5,2,10,33,1);
//		
//		Optional<Integer> max = max_number.stream().max((a,b) -> a-b);
//		System.out.println(max.get());


		//👉 Find the minimum number from a list.
		
//		List<Integer> min_number = Arrays.asList(1,3,2,11,43,44,22,11,0);
//		Optional<Integer> min =min_number.stream().min((a,b) -> a-b);
//		System.out.println(min.get());

		//🟡 Level 2: Intermediate (8–14)
		

		//👉 Given a list, remove duplicate elements.
		
//		
//		List<Integer> number1 = Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,2);
//		number1.stream().distinct().forEach(number -> System.out.println(number));

		//9. Sort List

		//👉 Sort a list in ascending order.
		
//		List<Integer> asc = Arrays.asList(2,3,4,1,5,6,3,7,1,2,3);
//		
//		List<Integer> sort = asc.stream().sorted().collect(Collectors.toList());
//		System.out.println(sort);

		//10. Sort in Descending Order
		

		//👉 Sort a list in descending order.
		
//		List<Integer> number = Arrays.asList(2, 3, 1, 4, 2, 5, 6, 1, 1, 21, 15);
//
//        List<Integer> ans = number.stream()
//                                  .sorted((a, b) -> b-a)
//                                  .collect(Collectors.toList());
//
//        System.out.println(ans);

		//11. Filter Strings Starting with 'A'

		//👉 From a list of strings, return only those starting with "A".
		
//		List<String> names = Arrays.asList("Ayush","Anish", "Achintya", "show");
//		
//		List<String> ans = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
//		
//		System.out.println(ans);
        
        

		//12. Find First Element

		//👉 Get the first element from a list using Stream.
		
//		List<Integer> number = Arrays.asList(2,1,3,1,3,1,1,14,3,2);
//		
//		Optional<Integer> ans = number.stream().findFirst();
//		
//		System.out.println(ans.get());

		//13. Skip Elements

		//👉 Skip first 3 elements and print remaining.
		
//		List<Integer> ans = Arrays.asList(1,3,2,4,5,3,33,32,98);
//		
//		List<Integer> new_ans = ans.stream().skip(3).collect(Collectors.toList());
//		System.out.println(new_ans);

		//14. Limit Elements

		//👉 Get only first 5 elements from a list.
		
//		List<Integer> number = Arrays.asList(1,2,3,5,43,41,98);
//		List<Integer> ans = number.stream().limit(5).collect(Collectors.toList());
//		
//		System.out.println(ans);

		//🟠 Level 3: Slightly Advanced (15–20)
		//15. Sum of All Elements

		//👉 Find sum of all numbers using Stream.
		
		

		//16. Average of Numbers

		//👉 Find average of a list of integers.

		//17. Check Any Match

		//👉 Check if any number is greater than 50.

		//18. Check All Match

		//👉 Check if all numbers are even.

		//19. Group by Length

		//👉 Group strings based on their length.

		//20. Flatten List (flatMap)

		//👉 Convert List<List<Integer>> into a single list.
		
		
		
		
		
		// find the sum of all number in the list
		
//		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		long sum =number.stream().reduce(0, (a,b) -> a +b);
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
