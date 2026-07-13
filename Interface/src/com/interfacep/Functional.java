
package com.interfacep;
import java.util.*;


@FunctionalInterface
interface Paytm{
	
	public abstract int pay(int a, int b);
	
	public default void def() {
		System.out.println("To Order this product");
	}
	
	
}




public class Functional {
	
	public static  void  tax(int a, int b) {
		int tax = a+b;
		System.out.println("Total tax on this order is $"+ tax);
	}
	
	public static void main(String[] args) {
		
		Paytm p = (i, j) -> {
			
			int a = i*j;
			int b = i-j;
			tax(a,b);
			return a -b;
		};
		p.def();
		System.out.println("You have to pay $"+ p.pay(5,6)+" only");
		
		
		
		
	}

}
