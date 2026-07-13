package com.Singleton.Singleton;

import com.beanClass.Calculator;

public class App 
{
    public static void main( String[] args )
    {
        Calculator c1 = Calculator.createCalculator();
        Calculator c2 = Calculator.createCalculator();
        Calculator c3 = Calculator.createCalculator();
        Calculator c4 = Calculator.createCalculator();
        
        
        System.out.println("------------------------");
        System.out.println("Checking if it is the same object");
        System.out.println(c1==c2);
        System.out.println(c2==c3);
        System.out.println(c3==c4);
    }
}
