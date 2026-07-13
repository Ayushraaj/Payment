package com.DependencyInjectionONE.DependencyInjectionONE;

import com.Beans.Address;
import com.Beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        
    	Address address = new Address("BTM", 12345, "Banglore", "India");
    	
    	Student s = new Student("Ayush", 100000.0, "JP Morgan", address);
    	
    	s.employeeDetails();
    	address.addressDetails();
    	
    	s.setAddress(address);
    }
}
