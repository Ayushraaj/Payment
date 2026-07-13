package com.SpringJavaTHREE.SpringJavaTHREE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.NonPrimeUser;
import com.beans.PrimeUser;
import com.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	
    	
    	PrimeUser p = (PrimeUser)applicationContext.getBean("primeUser");
    	p.user();
    	p.userName();
    	
    	System.out.println("--------------");
    	
    	System.out.println("Non Prime User");
    	System.out.println("-----------");
    	
    	NonPrimeUser np = (NonPrimeUser)applicationContext.getBean("nonPrimeUser");
    	np.user();
    	np.userName();
    }
}
