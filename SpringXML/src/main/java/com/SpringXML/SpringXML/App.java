package com.SpringXML.SpringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Account;



class App 
{
    public static void main( String[] args )
    {
    	String xml_path = "bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml_path);
        
        Account account = (Account)applicationContext.getBean("acc");
        account.amount();
    }
}
