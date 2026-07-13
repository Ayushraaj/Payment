package com.strings;



public class Strings {
	
	public static void main(String[] args) {
		
//		String s1 = "Ayush";
//		String s2 = new String("Raj");
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
		
//		String s1 = "Ayush";
//		String s2 ="Raj";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
//		String s1 = "Ayush";
//		String s2 = "Ayush";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
		
//		String s1 = new String("Ayush");
//		String s2 = new String("Raj");
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
		
//		String s1 = new String("Ayush");
//		String s2 = new String("Ayush");
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
		
//		String s1 = "Ayush";
//		
//		s1.concat("Raj");
//		System.out.println(s1);
		
		
//		String s1 = "Ayush" + "Raj";
//		System.out.println(s1);
		
		
//		String s1 = "Ayush";
//		String s2 = "Raj";
//		String s3 = s1 + s2;
//		System.out.println(s3);
		
//		StringBuilder sb = new StringBuilder("Ayush");
//		sb.append("Raj");
//		System.out.println(sb);
		
		
//		StringBuffer sb = new StringBuffer("Ayush");
//		sb.append("Raj");
//		System.out.println(sb);
		
		
		// 27th feb
		//---------------------------------------------
		
//		System.out.println("Start ");      // this line will execute
//		String name = null;                // this line will execute
//		System.out.println(name.length());     // this line throws null pointer exception and terminate the window
//		System.out.println("End");         // this line wont execute
		
		
		// code which may throws exception / risky code will be surround with try and catch
		
		//--------------------------------------------
		
//		System.out.println("Start");
//		String name = null;
//		
//		try {
//			System.out.println("Start of the try block");
//			System.out.println(name.length());           // here exception will be catch
//			System.out.println("End of the try block");  // this line wont executed
//			
//		} catch (Exception err) {      //  in the  err the exception will be there
//			
//			System.out.println(err);   //  here we are printing the exception
//		}
//		
//		System.out.println("End");
		
		
		//----------------------------------------------
		
//		System.out.println("START");
//		
//		int amount =1000;
//		int result = amount/0;
//		
//		try {
//			
//			System.out.println("Start of the try block");
//			System.out.println(result);
//			System.out.println("End of the try block");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("END");
		
		//-------------------------------------
		
		
		
//		String name = args[0];
//		try {
//			System.out.println(name);
//		}
//		catch (Exception e){
//			System.out.println(e);
//		}
//		
		
		
		 // --------------------------------------------- 9thMarch
		
//		System.out.println("Start of the program");
//		
//		String name = null;
//		
//		try {
//			int length = name.length();
//			
//			System.out.println("The length of the user name is -> "+ length);
//		
//		}
//		
//		
//		
//		catch (Exception e) {           // this catch block will be take care for all the exceptions (Parent)
//			
//			System.out.println("Start of the catch block");
//			System.out.println("User name is null");
//			System.out.println(e);
//			System.out.println("End of the catch block");
//			
//		}
//		
//		//  this nullPointerException catach is unreachable  (Child)   but if i will write this above the parent catch block then it will work
//		
//		catch ( NullPointerException e) {
//			System.out.println(e);
//		}
//		
//		
//		
//		System.out.println("End of the program");
		
		
		
		//Every exception is thrown only at the run time
		
		
		// checked Exception are known by the complier
		
		
//		--------------------------------
		
//		Class.forName("com.abc");   --> class not found/file not found error  (it is of checked type)
		
//		it will compile only when you write it in inside the try and catch block, we can also say compile time exception
		
		
		
		
//		String name = null;					   -- this is of unchecked type
//		name.length();                         -- run time/ unchecked
		
		
//		-----------------------------------------------------------------------------
		
		
//		ArrayList<String> arr = new ArrayList<String>();
//		
//		arr.add("Karnataka");
//		arr.add("maharastra");
//		arr.add("chennai");
//		arr.add("delhi");
//		arr.add("chennai");
//		
//		
//		System.out.println(arr);
//		
//		arr.add(0, "kolkata");
//		
//		System.out.println("---------------------------");
//		
//		
//		// for loop
//		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
//		
//		
//		System.out.println("---------------------------");
//		
//		// for each
//		
//		for(String element : arr) {
//			System.out.println(element);
//		}
//		
//		System.out.println("---------------------");
//		
//		
//		// iterator  (must)
//		Iterator<String> itr = arr.iterator();
//		
//		while(itr.hasNext()) {
//			
//			String element =  (String) itr.next();
//			System.out.println(element);
//		}
//		
//		----------------------------------------------------------------------------
		
		
//		LinkedList
		
		
		


	}

}
