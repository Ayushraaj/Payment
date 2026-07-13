

package com.Abstraction;

abstract class Bank{
	
	String name ;
	Bank(String name){
		this.name = name;
	}
	public abstract void pay();
	public void error() {
		System.out.println("Printing the eror");
	}
	
	public String getName() {
		return name;
	}
}

class Gpay extends Bank{
	
	Gpay(){
		super("GooglePay");
	}
	
	public void pay() {
		System.out.println("This is a pay method");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.pay();
		System.out.println(g.getName());
	}
}
