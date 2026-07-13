package com.trail;


class Bank{
	
	private int amount;
	
	Bank(int amount){
		this.amount = amount ;
	}
	
	
	
	public int getBalance() {
		return amount;
	}
	
	public void setBalance(int bal) {
		
		if(bal >0) {
			amount = amount+ bal;
			System.out.println("Balance is updated Successfully");
			
		}
		else {
			System.out.println("Something went wrong");
		}
	}
}

public class Trail1 {
	public static void main(String[] args) {
		
		Bank b = new Bank(400);  //400
		int a = b.getBalance();   //400
		System.out.println(a);
		

		
		
	}

}
