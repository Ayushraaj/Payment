package com.trail;


class Ayush{
	
	
}

class Ayush1{
	String name ;
	
	Ayush1(String a){
		this();
		this.name= a;	
	}
	
	Ayush1(){
		System.out.println("Without paramenter");
	}
}


class Ayush2{
	String name ;
	
	Ayush2(String a){
		
		this.name= a;	
	}
	
	Ayush2(){
		
		this("hj");
		System.out.println("Without paramenter");
	}
		
	
	
}



public class Trial2 {
	
	public static void main(String[] ayush) {
		
		Ayush a = new Ayush();   // default
		Ayush1 a1 = new Ayush1("Ayush");
		System.out.println(a1.name);
		
	}

}
