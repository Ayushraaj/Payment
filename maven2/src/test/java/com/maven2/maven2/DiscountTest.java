package com.maven2.maven2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class DiscountTest {
	

	
	
	@Test
	public void testLaptopPriceBelow2k() {
		
		Discount discount = new Discount();
		int Expectedprice = 1700;
		
		Map<String, Object > ans = discount.laptopPrice(1900);
		int ActualPrice = (int) ans.get("Product1");
		assertEquals(Expectedprice, ActualPrice);
	}
	
	@Test
	public void testLaptopPriceAbove2k() {
		
		Discount discount = new Discount();
		int Expectedprice = 1700;
		
		Map<String, Object > ans = discount.laptopPrice(2100);
		int ActualPrice = (int) ans.get("Product2");
		assertEquals(Expectedprice, ActualPrice);
	}
	
	

}
