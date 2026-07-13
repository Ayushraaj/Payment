package com.SingletonONE.SingletonONE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.beans.Payment;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        Payment payment = (Payment)ap.getBean("Payment");
        payment.BankDetails();
        
        
        Payment payment1 = (Payment)ap.getBean("Payment");
        payment1.BankDetails();
        
        System.out.println(payment== payment1);
    }
}
