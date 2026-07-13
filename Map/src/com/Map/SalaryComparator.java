package com.Map;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		
		int result =0;
		
		if(e1.getSalary() < e2.getSalary()) {
			result = result -1;
		}
		else if( e1.getSalary()> e2.getSalary()) {
			result = result +1;
		}
		
		else {
			 result =0;
		}
		
		return result;
	}

}
