package com.trail;


import java.util.*;

class Parent{
    public void a(){
        System.out.println("Parent");
    }
}

class Child extends Parent{

    @Override
    public void a(){
        System.out.println("Child");
    }

    public void b(){
        System.out.println("Child specific method");
    }
}

public class Trial3 {
    public static void main(String[] args) {
      
      Parent p = new Child();
      p.a();
      


      Parent p1 = new Child();
      Child c = (Child)p1;
      c.a();
      c.b();

      
    }
}


		// downcasting
//		Parent  p = new Child();
//		Child c = (Child) p;
//		c.a();
		
		
		//-------------------
		// upcasting
		
//		Parent p = new Child();
//		p.a();
		// -> compile time for p.a() available or not
		// -> runtime  actual object method calls here 
	
	


