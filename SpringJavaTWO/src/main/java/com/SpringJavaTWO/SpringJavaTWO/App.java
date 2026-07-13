package com.SpringJavaTWO.SpringJavaTWO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Colour;
import com.beans.Red;
import com.beans.Yellow;
import com.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Red red = (Red)applicationContext.getBean("red");
    	red.colour();
    	red.yellow();
    	red.red();
    	
    	System.out.println("--------------------------");
    	Colour colour = (Colour)applicationContext.getBean("colour");
    	colour.colour();
    	
    	
    	System.out.println("-------------------------");
    	
    	Yellow yellow = (Yellow)applicationContext.getBean("yellow");
    	yellow.colour();
    	yellow.yellow();
    }
}
