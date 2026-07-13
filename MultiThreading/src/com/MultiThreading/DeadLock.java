package com.MultiThreading;


class Ecom {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void get_product() {

        synchronized (lock1) {
            System.out.println("Product thread acquired lock1");

            try {
            	Thread.sleep(100); 
            	}
            catch (Exception e) {
            	
            }

            synchronized (lock2) {
                System.out.println("Product thread acquired lock2");

                for (int i = 0; i < 5; i++) {
                    System.out.println("Product -> " + i);
                }
            }
        }
    }

    public void get_discount() {

        synchronized (lock2) {
            System.out.println("Discount thread acquired lock2");

            try {
            	Thread.sleep(100);
            	}
            catch (Exception e) {
            	
            }

            synchronized (lock1) {
                System.out.println("Discount thread acquired lock1");

                for (int i = 0; i < 5; i++) {
                    System.out.println("Discount -> " + i);
                }
            }
        }
    }
}

class Product extends Thread {

    Ecom e;

    Product(Ecom e) {
        this.e = e;
    }

    public void run() {
        e.get_product();
    }
}

class Discount extends Thread {

    Ecom e;

    Discount(Ecom e) {
        this.e = e;
    }

    public void run() {
        e.get_discount();
    }
}

public class DeadLock {
    public static void main(String[] args) {

        Ecom e = new Ecom();

        Product p = new Product(e);
        Discount d = new Discount(e);

        p.start();
        d.start();
    }
}
