package com.SpringJavaFour.SpringJavaFour;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.PrimeUsers;
import com.config.AppConfig;

public class App 
{
    public static void main( String[] args )  {
    	
    	
 
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	PrimeUsers p = (PrimeUsers)applicationContext.getBean("primeUser");
    	p.insertUsers();
    	System.out.println("-----------------");
    	p.viewAllUsers();
    	System.out.println("----");
    	p.primeUsers();
    	System.out.println("---------");
    	p.nonPrimeUsers();
    }
}
