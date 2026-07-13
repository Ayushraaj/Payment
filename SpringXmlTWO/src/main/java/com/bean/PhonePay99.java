package com.bean;




public class PhonePay99 extends Gpay1 {
	
	@Override
	public void bankMethod() {
		System.out.println("Bank offical method is updated by PhonePay");
		
	}
	
	@Override
	public void gPay() {
		System.out.println("Gapy method is updated by PhonePay");
	}
}