package com.SpringXmlTHREE.SpringXmlTHREE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Iphone;
import com.bean.Samsung;

public class App 
{
    public static void main( String[] args )
    {
    	String xml_path = "beanss.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml_path);
        
        Iphone iphone = (Iphone)applicationContext.getBean("iphone");
        iphone.iphone();
        
        
        System.out.println("-------------");
        Samsung samsung = (Samsung)applicationContext.getBean("samsung");
        samsung.samsung();
        
        
        
    }
}
