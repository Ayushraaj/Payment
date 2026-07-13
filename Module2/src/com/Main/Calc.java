package com.Main;

import com.lib.Calculator;

public class Calc {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int ans = c.add(3, 9);
		
		System.out.println(ans);
	}

}
