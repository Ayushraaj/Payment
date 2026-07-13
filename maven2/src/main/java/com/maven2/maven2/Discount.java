package com.maven2.maven2;

import java.util.HashMap;
import java.util.Map;

public class Discount {
	
	
	
	public Map<String, Object> laptopPrice(int price){
		
		Map<String, Object> map = new HashMap<String, Object>();
	
		
		if(price <1000) {
			map.put("msg", "No discount on this product");
		}
		
		if(price <2000) {
			
			int discount = 200;
			int new_price = price - discount;
			
			map.put("Product1", new_price);
			
		}
		else {
			
			int discount = 400;
			int new_price = price - discount;
			map.put("Product2", new_price);
		}
		
		return map;
		
	}

}
