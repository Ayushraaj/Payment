package com.interfacep;


class Account implements Cloneable{
	
	public String name;
	
	public Account(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}



public class MarkerInterface {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account acc1 = new Account("Ayush");
		Account acc2 = (Account) acc1.clone();      // downcasting 
		System.out.println(acc1.name);
		
		
		
	}

}
