package com.trail;



class Employee implements Cloneable{
	
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}




public class Marker {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee a1 = new Employee("Ayush");
		//System.out.println(a1.name);
		
		Employee a2 = (Employee) a1.clone();
		
		System.out.println(a2.name);
		
		
	}
}
