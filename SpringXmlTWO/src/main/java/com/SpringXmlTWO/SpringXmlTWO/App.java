package com.SpringXmlTWO.SpringXmlTWO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Bank;
import com.bean.Gpay1;
import com.bean.PhonePay99;

public class App 
{
    public static void main( String[] args )
    {
    	String xml_path = "bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml_path);
        
        Bank b = (Bank)applicationContext.getBean("bank");
        b.bankMethod();
        

        Gpay1 g = (Gpay1) applicationContext.getBean("gpay");
        g.bankMethod();
        g.gPay();
        
        PhonePay99 p = (PhonePay99)applicationContext.getBean("phonepay");
        p.bankMethod();
        p.gPay();
        
    	
    	
    }
}
