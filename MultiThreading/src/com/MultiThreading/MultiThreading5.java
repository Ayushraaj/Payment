//package com.MultiThreading;
//
//
//
//
//class Ecom{
//	
//	public  void get_product() {
//		
//		System.out.println("This is a get_product method");
//		
//		for(int i=0; i<10; i++) {
//			
//			synchronized (this){
//				System.out.println(" The product name is -> Product "+ i);
//			}
//		}
//		
//		
//	}
//	
//	public  void get_discount() {
//		
//		System.out.println("This is a product discount method");
//		
//		for(int i=0; i<2; i++) {
//			
//			synchronized (this) {
//				System.out.println("The discount is avail. on the  Product -> " + i);
//			}
//		}
//	}
//}
//
//
//class Product extends Thread{
//	
//	Ecom e;
//	Product(Ecom e){
//		this.e =e;
//	}
//	
//	public void run() {
//		e.get_product();
//		
//	}
//}
//
//class Discount extends Thread{
//	
//	Ecom e;
//	Discount(Ecom e){
//		this.e =e;
//	}
//	
//	public void run() {
//		e.get_discount();
//	}
//}
//
//
//
//
//public class MultiThreading5 {
//	public static void main(String[] args) {
//		
//		Ecom e = new Ecom();
//		Product p = new Product(e);
//		p.start();
//		
//		Discount d = new Discount(e);
//		d.start();
//		
//		
//		
//
//	}
//
//}
